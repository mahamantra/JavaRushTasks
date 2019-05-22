package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings=new ArrayList<>();
        String s="",d="end";

        for (int i = 0; true; i++) {s=reader.readLine();if (s.equals(d))break;else strings.add(s);

        }
        for (String i:strings
             ) {
            System.out.println(i);

        }
    }
}