package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush"));
    }

    public static String getPartOfString(String string) {
        try {
            String[] s = string.split(" ");
            String s1 = s[1] + " " + s[2] + " " + s[3] + " " + s[4];return s1;
        }catch (Exception e) {throw new TooShortStringException();}

    }

    public static class TooShortStringException extends RuntimeException{
    }
}
