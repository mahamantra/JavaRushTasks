package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum=0,N=0,a=0 ;

        N=Integer.parseInt(reader.readLine());

        for (int i=N; i !=0 ; i--) {
            a=Integer.parseInt(reader.readLine());
            if (i==N) maximum=a;
            if (a> maximum) maximum=a;

        }

        System.out.println(maximum);
    }
}
