package com.javarush.task.task30.task3009;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/* 
Палиндром?
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getRadix("112"));        //expected output: [3, 27, 13, 15]
       // System.out.println(getRadix("123"));        //expected output: [6]
        //System.out.println(getRadix("5321"));       //expected output: []
       // System.out.println(getRadix("1A"));         //expected output: []
    }

    private static  Set<Integer> getRadix(String number){

        BigInteger bigInteger=new BigInteger(number);
        String s=null;
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();



        for (int i = 1; i <37 ; i++) {
            s1.setLength(0);
            s2.setLength(0);
            s=(bigInteger.toString(i));
            s1.append(s.substring(0,(s.length()/2)));
            s2.append(s.substring((s.length()/2)+1));
        }

        return null;
    }
}