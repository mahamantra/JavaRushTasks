package com.javarush.task.task19.task1913;

/* 
Выводим только цифры
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream save=System.out;

        ByteArrayOutputStream stream=new ByteArrayOutputStream();
        PrintStream printStream=new PrintStream(stream);
        System.setOut(printStream);

        testString.printSomething();

        String string=stream.toString().replaceAll("[^\\d]","");

        System.setOut(save);
        System.out.println(string);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
