package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s;
        ArrayList<String> list=new ArrayList<>();

        while(true){
        s=reader.readLine();
        if (s.equals("exit")) break;
        else list.add(s);
        }

        for (String i:list
             ) {
            try{
            if(i.contains("."))print(Double.parseDouble(i));
            else if (Integer.parseInt(i)>0&Integer.parseInt(i)<128)print(Short.parseShort(i));
            else if (Integer.parseInt(i)<=0|Integer.parseInt(i)>=128)print(Integer.parseInt(i));
            else print(i);}
            catch (Exception e){print(i);}
        }



    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
