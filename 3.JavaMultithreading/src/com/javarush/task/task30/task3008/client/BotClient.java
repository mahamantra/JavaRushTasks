package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BotClient extends Client {
    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected String getUserName() {


        return "date_bot_" + (int) (Math.random() * 100);

    }

    public static void main(String[] args) {
        new BotClient().run();
    }

    public class BotSocketThread extends SocketThread {
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
            if(!message.contains(":"))return;
            String[] strings=message.split(": ");
            Calendar calendar=Calendar.getInstance();
            switch (strings[1]){
                case "дата":sendTextMessage("Информация для "+strings[0]+": "+new SimpleDateFormat("d.MM.YYYY").format(calendar.getTime()));break;
                case "день":sendTextMessage("Информация для "+strings[0]+": "+new SimpleDateFormat("d").format(calendar.getTime()));break;
                case "месяц":sendTextMessage("Информация для "+strings[0]+": "+new SimpleDateFormat("MMMM").format(calendar.getTime()));break;
                case "год":sendTextMessage("Информация для "+strings[0]+": "+new SimpleDateFormat("YYYY").format(calendar.getTime()));break;
                case "время":sendTextMessage("Информация для "+strings[0]+": "+new SimpleDateFormat("H:mm:ss").format(calendar.getTime()));break;
                case "час":sendTextMessage("Информация для "+strings[0]+": "+new SimpleDateFormat("H").format(calendar.getTime()));break;
                case "минуты":sendTextMessage("Информация для "+strings[0]+": "+new SimpleDateFormat("m").format(calendar.getTime()));break;
                case "секунды":sendTextMessage("Информация для "+strings[0]+": "+new SimpleDateFormat("s").format(calendar.getTime()));break;
            }
        }
    }
}
