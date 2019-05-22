package com.javarush.task.task19.task1912;

/* 
Ридер обертка 2
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream save=System.out;

        ByteArrayOutputStream array=new ByteArrayOutputStream();
        PrintStream printStream=new PrintStream(array);
        System.setOut(printStream);

        testString.printSomething();

        String result=array.toString().replaceAll("te","??");

        System.setOut(save);
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
