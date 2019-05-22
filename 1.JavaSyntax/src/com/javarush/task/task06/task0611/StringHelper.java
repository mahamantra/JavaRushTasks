package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        result=(s+s+s+s+s);
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        for (; count >0 ; count--) result+=s;


        return result;
    }

    public static void main(String[] args) {

        System.out.println(StringHelper.multiply("a",6));
    }
}
