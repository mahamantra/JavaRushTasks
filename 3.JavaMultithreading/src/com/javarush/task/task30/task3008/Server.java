package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void sendBroadcastMessage(Message message) {
        for (Connection connection : connectionMap.values()
        ) {
            try {
                connection.send(message);
            } catch (IOException e) {
                System.out.println("Message did't send");
            }
        }
    }


    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            Message message;

            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST, "Name request"));
                message = connection.receive();
                if (message.getType() == MessageType.USER_NAME && !message.getData().matches("^\\s*")) {
                    if (message.getData() != null && !connectionMap.containsKey(message.getData())) {

                        connectionMap.put(message.getData(), connection);
                        connection.send(new Message(MessageType.NAME_ACCEPTED, "Name accepted"));
                        break;
                    }
                }
            }
            return message.getData();
        }

        private void notifyUsers(Connection connection, String userName) throws IOException {
            for (String name : connectionMap.keySet()
            ) {
                if (name != userName) {
                    Message message = new Message(MessageType.USER_ADDED, name);
                    connection.send(message);
                }

            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (message.getType() == MessageType.TEXT) {
                    Message message1 = new Message(MessageType.TEXT, userName + ": " + message.getData());
                    sendBroadcastMessage(message1);
                } else ConsoleHelper.writeMessage("This Message is not text ");
            }
        }

        private void removedUser(Connection connection, String userName) {
            connectionMap.remove(userName);
            try {
                connection.send(new Message(MessageType.USER_REMOVED, "Delete user " + userName));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void run() {
            String userName = null;
            System.out.println(socket.getRemoteSocketAddress());
            try (Connection connection = new Connection(socket)) {

                userName = serverHandshake(connection);
                Server.sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                notifyUsers(connection, userName);
                serverMainLoop(connection, userName);
            } catch (IOException | ClassNotFoundException e) {
                ConsoleHelper.writeMessage("Error");
            } finally {
                if (userName != null) {
                    connectionMap.remove(userName);
                    Server.sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
                    ConsoleHelper.writeMessage("Connection close");
                }
            }

        }
    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(ConsoleHelper.readInt());
        System.out.println("Server is runing");
        while (true) {
            try {
                Socket socket = serverSocket.accept();
                Handler handler = new Handler(socket);
                handler.start();
            } catch (IOException e) {
                serverSocket.close();
                System.out.println("Error");
                break;
            }
        }
    }
}
