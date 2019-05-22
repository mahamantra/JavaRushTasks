package com.javarush.task.task14.task1421;

public class d {
    private static d ourInstance = new d();

    public static d getInstance() {
        return ourInstance;
    }

    private d() {
    }
}
