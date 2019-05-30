package com.javarush.task.task17.task1712;

public class Order {
    private long time;//время заказа
    private byte tableNumber;//номер стола

    public Order(byte tableNumber) {
        time = (long) (Math.random() * 200);
        this.tableNumber = tableNumber;
    }

    public long getTime() {
        return time;
    }

    public byte getTableNumber() {
        return tableNumber;
    }
}
