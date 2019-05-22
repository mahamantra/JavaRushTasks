package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream sava=System.out;

        ByteArrayOutputStream outputStream=new ByteArrayOutputStream();




    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for 11testing");
        }
    }
}

