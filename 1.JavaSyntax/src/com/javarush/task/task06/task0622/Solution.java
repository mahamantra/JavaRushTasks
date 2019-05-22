package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
int[] a=new int[5];
int max=0;
        for (int i = 0; i <5; i++) {
            int n=Integer.parseInt(reader.readLine());
            if (i==4) max=n;else if (max<n) max=n;
            a[i]=n;
        }


        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) { if (a[i]<a[j]) {max=a[j];a[j]=a[i];a[i]=max;}
            }

        }
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
    }


}
