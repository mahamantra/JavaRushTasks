package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
       char[] a= s.toCharArray();

       if (!Character.isWhitespace(a[0]))a[0]=Character.toUpperCase(a[0]);
        for (int i = 1; i <a.length ; i++) {
            if (Character.isWhitespace(a[i-1])&&!Character.isWhitespace(a[i])) {a[i]=Character.toUpperCase(a[i]);}

        }


            System.out.println(new String(a));

    }
}
