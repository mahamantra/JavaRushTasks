package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";


        for (int i = 0,start=0,end=s.length(); i <40 ; i++,start++) {
            char[] dst=new char[end-start];
            s.getChars(start,end,dst,0);
            System.out.println(dst);

        }
    }

}

