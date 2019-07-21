package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.Connection;
import com.javarush.task.task30.task3008.ConsoleHelper;
import com.javarush.task.task30.task3008.Message;
import com.javarush.task.task30.task3008.MessageType;

import java.io.IOException;
import java.net.Socket;

public class Client {
    protected Connection connection;
    volatile private boolean clientConnected = false;

    protected String getServerAddress() {
        ConsoleHelper.writeMessage("Writing Srver Addres");
        return ConsoleHelper.readString();
    }

    protected int getServerPort() {
        ConsoleHelper.writeMessage("Write Server Port");

        return ConsoleHelper.readInt();
    }

    protected String getUserName() {
        ConsoleHelper.writeMessage("напишите имя");

        return ConsoleHelper.readString();
    }

    protected boolean shouldSendTextFromConsole() {
        return true;
    }

    protected SocketThread getSocketThread() {
        return new SocketThread();
    }

    protected void sendTextMessage(String text) {
        try {
            connection.send(new Message(MessageType.TEXT, text));
        } catch (IOException e) {
            ConsoleHelper.writeMessage("Error send Text message");
            clientConnected = false;
        }
    }

    synchronized public void run() {
        SocketThread socketThread = getSocketThread();
        socketThread.setDaemon(true);
        socketThread.start();
        try {
            this.wait();
        } catch (InterruptedException e) {
            ConsoleHelper.writeMessage("Error wait");
            return;

        }
        if (clientConnected) ConsoleHelper.writeMessage("Соединение установлено.\n" +
                "Для выхода наберите команду 'exit'.");
        else ConsoleHelper.writeMessage("Произошла ошибка во время работы клиента.");

        while (clientConnected) {
            String string = ConsoleHelper.readString();
            if (string.equals("exit")) break;
            if (shouldSendTextFromConsole()) sendTextMessage(string);
        }
    }

    public static void main(String[] args) {
        new Client().run();
    }

    public class SocketThread extends Thread {

        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
        }

        protected void informAboutAddingNewUser(String userName) {
            ConsoleHelper.writeMessage(userName + " join chat");
        }

        protected void informAboutDeletingNewUser(String userName) {
            ConsoleHelper.writeMessage(userName + " deleted chat");
        }

        protected void notifyConnectionStatusChanged(boolean clientConnected) {
            Client.this.clientConnected = clientConnected;
            synchronized (Client.this) {
                Client.this.notify();
            }
        }

        protected void clientHandshake() throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (MessageType.NAME_REQUEST == message.getType()) {
                    String userName=getUserName();
                    connection.send(new Message(MessageType.USER_NAME,userName));
                    continue;
                }
                if(MessageType.NAME_ACCEPTED==message.getType()){
                    notifyConnectionStatusChanged(true);
                    return;
                }
                throw new IOException("Unexpected MessageType");
            }
        }

        protected void clientMainLoop() throws IOException, ClassNotFoundException{
            while (true){
                Message message=connection.receive();
                if (MessageType.TEXT==message.getType()){
                    processIncomingMessage(message.getData());
                    continue;
                }
                if(MessageType.USER_ADDED==message.getType()){
                    informAboutAddingNewUser(message.getData());
                    continue;
                }
                if(MessageType.USER_REMOVED==message.getType()){
                    informAboutDeletingNewUser(message.getData());
                    continue;
                }
                throw new IOException("Unexpected MessageType");
            }
        }

        public void run(){
            try {
                Socket socket=new Socket(getServerAddress(),getServerPort());
                connection=new Connection(socket);
                clientHandshake();
                clientMainLoop();
            } catch (IOException  |ClassNotFoundException e) {
                e.printStackTrace();
                notifyConnectionStatusChanged(false);
            }

        }
    }
}
