package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements ATableInterface{
        ATableInterface anInterface;

        public TableInterfaceWrapper(ATableInterface anInterface){
            this.anInterface=anInterface;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            anInterface.setModel(rows);

        }

        @Override
        public String getHeaderText() {

            return anInterface.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            anInterface.setHeaderText(newHeaderText);

        }
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}