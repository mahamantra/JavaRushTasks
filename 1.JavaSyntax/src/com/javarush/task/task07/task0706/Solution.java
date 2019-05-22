package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] a=new int[15];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
int b=0,c=0;
        for (int i = 0; i <a.length ; i++) {a[i]=Integer.parseInt(reader.readLine());
            if (i%2==0) b+=a[i];else c+=a[i];
                   }
        if (b>c)System.out.println("В домах с четными номерами проживает больше жителей.");
        else
        System.out.println("В домах с нечетными номерами проживает больше жителей.");

    }
}
