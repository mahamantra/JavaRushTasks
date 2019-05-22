package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream save = System.out;
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(ba);
        System.setOut(printStream);

        testString.printSomething();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ba);

        Pattern pattern = Pattern.compile("\\n");
        Matcher matcher = pattern.matcher(stringBuilder);
        int i = 0;
        ArrayList<Integer> arrayList=new ArrayList<>();

        System.setOut(save);

        while (matcher.find()) {
          i++;
        if (i == 2) {
            arrayList.add(matcher.start()+1);
            i=0;
        }
        }
        for (int j = arrayList.size()-1; j >=0 ; j--) {
            stringBuilder.insert(arrayList.get(j),"JavaRush - курсы Java онлайн\n");
        }
        System.out.println(stringBuilder);


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
