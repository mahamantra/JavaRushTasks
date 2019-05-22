package com.javarush.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[100000];
        for (int i = 0; i < 100000; i++) {
           // array[i] = Integer.parseInt(reader.readLine());
            array[i] = (int) (Math.random() * 1000);
        }
        Date a=new Date();

        sort(array);
        Date b=new Date();
        long c=b.getTime()-a.getTime();

//        for (int i : array) {
//            System.out.print(i + " ");
//        }
        System.out.println(c);

//        System.out.println(array[9]);
//        System.out.println(array[10]);
    }

    public static void sort(int[] array1) {
        int[] array=array1;
        int tmp;
        for (int i = array.length; i > 1; i--)
            for (int j = 0; j < i-1; j++) {

                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;


                }
            }
    }
    public static void sort1(int[] array1) {
        int[] array=array1;
        int tmp;
        for (int i = 0; i < array.length-1; i++)
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]){
                    tmp=array[i];
                    array[i]=array[j];
                    array[j]=tmp;
                }
            }

        }
    }


