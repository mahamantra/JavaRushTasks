package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {

            array[i] = Integer.parseInt(reader.readLine());
           // array[i]=(int) (Math.random()*100);
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        int max=array[0];
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 1+i; j <array.length; j++) {
                if (array[i]<array[j]) {
                    max=array[j];
                    array[j]=array[i];
                    array[i]=max;}

            }

        }
    }
}
