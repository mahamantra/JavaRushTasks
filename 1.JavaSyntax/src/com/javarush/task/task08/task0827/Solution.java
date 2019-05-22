package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date data= new Date(date);
        Date data1= new Date(date);
        data1.setMonth(0);
        data1.setDate(1);
        long a=data.getTime()-data1.getTime();
        long b=24*60*60*1000;
int day=(int)(a/b);
        boolean d=day%2==0?true:false;




        return d;
    }
}
