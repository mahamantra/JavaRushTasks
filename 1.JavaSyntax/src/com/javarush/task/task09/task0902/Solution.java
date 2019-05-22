package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        StackTraceElement[] element=Thread.currentThread().getStackTrace();
        System.out.println(element[2].getMethodName());
        method2();

        return element[2].getMethodName();
    }

    public static String method2() {
        StackTraceElement[] element=Thread.currentThread().getStackTrace();
        System.out.println(element[2].getMethodName());
        method3();

        return element[2].getMethodName();
    }

    public static String method3() {

        method4();
        StackTraceElement[] element=Thread.currentThread().getStackTrace();
        System.out.println(element[2].getMethodName());Thread.currentThread().getStackTrace()[2].getMethodName();
        return element[2].getMethodName();
    }

    public static String method4() {
        method5();
        StackTraceElement[] element=Thread.currentThread().getStackTrace();
        return element[2].getMethodName();
    }

    public static String method5() {
        StackTraceElement[] element=Thread.currentThread().getStackTrace();
        return element[2].getMethodName();
    }
}
