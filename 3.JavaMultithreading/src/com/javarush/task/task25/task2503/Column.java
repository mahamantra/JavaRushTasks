package com.javarush.task.task25.task2503;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public enum Column implements Columnable{
    Customer("Customer"),
    BankName("Bank Name"),
    AccountNumber("Account Number"),
    Amount("Available Amount");

    private String columnName;

    private static int[] realOrder;

    private Column(String columnName) {
        this.columnName = columnName;
    }

    /**
     * Задает новый порядок отображения колонок, который хранится в массиве realOrder.
     * realOrder[индекс в энуме] = порядок отображения; -1, если колонка не отображается.
     *
     * @param newOrder новая последовательность колонок, в которой они будут отображаться в таблице
     * @throws IllegalArgumentException при дубликате колонки
     */
    public static void configureColumns(Column... newOrder) {
        realOrder = new int[values().length];
        for (Column column : values()) {
            realOrder[column.ordinal()] = -1;
            boolean isFound = false;

            for (int i = 0; i < newOrder.length; i++) {
                if (column == newOrder[i]) {
                    if (isFound) {
                        throw new IllegalArgumentException("Column '" + column.columnName + "' is already configured.");
                    }
                    realOrder[column.ordinal()] = i;
                    isFound = true;
                }
            }
        }
    }

    /**
     * Вычисляет и возвращает список отображаемых колонок в сконфигурированом порядке (см. метод configureColumns)
     * Используется поле realOrder.
     *
     * @return список колонок
     */
    public static List<Column> getVisibleColumns() {
        List<Column> result = new LinkedList<>();
        Column [] temp=new Column[4];
        int i=0;
        for (Column column : Column.values()) {
            int index=realOrder[i];
            if (index<0){i++;continue;}
            temp[index]=column;
            i++;
        }

        for (Column column : temp) {
           if(column!=null) result.add(column);

        }
        return result;
    }

    @Override
    public String getColumnName() {
        return columnName;
    }

    @Override
    public boolean isShown() {
       // System.out.println(columnName+" "+ordinal()+" "+realOrder[ordinal()]);

        return !(realOrder[ordinal()]<0);
    }

    @Override
    public void hide() {
       int i= realOrder[ordinal()];
       realOrder[ordinal()]=-1;
        for (int j = 0; j <realOrder.length ; j++) {
            if (realOrder[j]>i)realOrder[j]-=1;
        }
    }


}
