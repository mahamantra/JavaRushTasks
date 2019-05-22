package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream save=System.out;

        ByteArrayOutputStream arrayOutputStream=new ByteArrayOutputStream();
        PrintStream printStream=new PrintStream(arrayOutputStream);
        System.setOut(printStream);



        testString.printSomething();

        OutputStream d=new FileOutputStream("f1");
        d.write(44);

        String[] s=arrayOutputStream.toString().split("\\s");
        System.setOut(save);
        for (String s1 : s) {
            System.out.println(s1.toCharArray());
        }
        int a=Integer.parseInt(s[0]);
        int b=Integer.parseInt(s[2]);
        int c=0;
        switch (s[1]){
            case"+":
                System.out.println(a+" + "+b+" = "+(a+b));break;
            case"-":System.out.println(a+" - "+b+" = "+(a-b));break;
            case"*":System.out.println(a+" * "+b+" = "+(a*b));break;
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

