package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        String s="level22.lesson13.task01";
        String[] strings=getTokens(s,".");
        for (String string : strings) {
            System.out.println(string);
        }


    }
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer=new StringTokenizer(query,delimiter);
        String[] strings1=new String[stringTokenizer.countTokens()];

        int j=stringTokenizer.countTokens();
        for (int i = 0; i <j; i++) {
            strings1[i]=stringTokenizer.nextToken();
        }


        return strings1;
    }
}
