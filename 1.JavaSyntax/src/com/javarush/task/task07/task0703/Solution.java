package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] s=new String[10];
        int[] n=new int[10];
        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i <s.length ; i++) {
                  s[i]=scanner.nextLine();
        }

        for (int i = 0; i <s.length ; i++) {n[i]=s[i].length();
            System.out.println(n[i]);

        }
    }
}
