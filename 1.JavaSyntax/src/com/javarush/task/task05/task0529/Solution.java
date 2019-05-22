package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String s="a";
        int a=0,sum=0;

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

            for (;!s.equals("сумма"); ) {
                s=reader.readLine();
                if (!s.equals("сумма")) {a=Integer.parseInt(s);sum+=a;}
            }
        System.out.println(sum);
    }

}
