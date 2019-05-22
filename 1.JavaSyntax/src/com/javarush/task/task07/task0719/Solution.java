package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList <Integer> n=new ArrayList<>();
        for (int i  = 0; i <10 ; i++) {n.add(Integer.parseInt(reader.readLine()));

        }
        for (int i = 0; i <n.size() ; i++) {
            System.out.println(n.get(n.size()-i-1));

        }
    }
}
