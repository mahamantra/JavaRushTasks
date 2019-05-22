package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        int a,b;
        if (string==null)throw new TooShortStringException();
        a=string.indexOf("\t");
        b=string.indexOf("\t",a+1);
        if (b<=0)throw new TooShortStringException();
        else return string.substring(a+1,b);
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString(null));


    }
}
