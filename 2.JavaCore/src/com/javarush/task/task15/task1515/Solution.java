package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Статики-2
*/

public class Solution {
    public static int A;
    public static int B;

    public static  int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    static {BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try {
            A=Integer.parseInt(reader.readLine());
            B=Integer.parseInt(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }MIN = min(A, B);


    }
}
