package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum=0;
        int minimum=0;
        int[] n=new int[20];

        for (int i = 0; i <20; i++) {
            n[i]=Integer.parseInt(reader.readLine()); if (i==0) minimum=maximum=n[0];
                                                         else if (maximum<n[i]) maximum=n[i];
                                                              else if (minimum>n[i]) minimum=n[i];
        }

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
