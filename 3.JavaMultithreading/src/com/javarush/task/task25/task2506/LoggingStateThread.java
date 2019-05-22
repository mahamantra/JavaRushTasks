package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread{
    Thread thread;

    LoggingStateThread (Thread thread){
        this.thread=thread;
    }

    @Override
    public void run() {
        State state=thread.getState();
        System.out.println(state);
        while (true) {
            if(!thread.getState().equals(state)){
                System.out.println(thread.getState());
                if (thread.getState()==State.TERMINATED)break;
                state=thread.getState();
            }
        }
    }
}
