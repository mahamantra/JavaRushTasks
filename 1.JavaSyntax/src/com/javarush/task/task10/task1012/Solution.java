package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        byte[] num=new byte[33];


        for (String str :list) {
            char[] c=str.toCharArray();
            for (int i = 0; i <c.length ; i++) {
                for (byte j = 0; j <abcArray.length ; j++) {
                    if (c[i] == abcArray[j]) {num[j]++;

                    }

                }

            }

        }
        for (int i = 0; i <abcArray.length ; i++) {

            System.out.println(abcArray[i]+" "+num[i]);

        }
    }


}
