package com.javarush.task.task09.task0930;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
//        while (true) {
//            String s = reader.readLine();
//            if (s.isEmpty()) break;
//            list.add(s);
//        }

        list.add("Вишня");
        list.add("1");
        list.add("Боб");
        list.add("3");
        list.add("Яблоко");
        list.add("22");
        list.add("0");
        list.add("Арбуз");


        String[] array = list.toArray(new String[list.size()]);
        Date a=new Date();
        for (int i=0;i<10000;i++) {
            sort(array);
        }
        Date b=new Date();
        long dalay=b.getTime()-a.getTime();
        System.out.println(dalay+"ms");

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        String n="";
        for (int i = 0; i <array.length-1; i++) {
            if (isNumber(array[i])){
                for (int j =i+ 1; j <array.length ; j++) {
                    if (isNumber(array[j])){
                        if (Integer.parseInt(array[i])<Integer.parseInt(array[j])){
                            n=array[i];
                            array[i]=array[j];
                            array[j]=n;
                        }
                    }

                }
            }
            else{
                for (int j = i+1; j <array.length ; j++) {
                    if (!isNumber(array[j])){
                        if (isGreaterThan(array[i],array[j])){
                            n=array[i];
                            array[i]=array[j];
                            array[j]=n;
                        }
                    }

                }
            }

        }
    }
//public static void sort(String[] array)
//{
//    String stmp = "";
//
//    for (int i = 0; i < array.length; i++)
//    {
//        for (int j = 0; j < array.length; j++) {
//
//            if (isNumber(array[i]) && isNumber(array[j])) // если число
//            {
//                if (Integer.parseInt(array[i]) > Integer.parseInt(array[j]))
//                {
//                    stmp = array[i];
//                    array[i] = array[j];
//                    array[j] = stmp;
//                }
//            }
//        }
//    }
//
//    for (int i = 0; i < array.length; i++)
//    {
//        for (int j = 0; j < array.length; j++) {
//
//            if (!isNumber(array[i]) && !isNumber(array[j])) // если строки
//            {
//                if (isGreaterThan(array[j], array[i]))
//                {
//                    stmp = array[i];
//                    array[i] = array[j];
//                    array[j] = stmp;
//                }
//            }
//        }
//    }
//}

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
