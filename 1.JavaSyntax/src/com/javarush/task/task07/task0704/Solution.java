package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
int[] n=new int[10];
int[] temp=new int[10];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <n.length ; i++) {n[i]=Integer.parseInt(reader.readLine());  temp[i]=n[i];

        }
        for (int i = 0; i <n.length ; i++) {n[i]=temp[temp.length-i-1];
            System.out.println(n[i]);

        }
    }
}

