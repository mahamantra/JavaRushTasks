package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(br.readLine());
        StringBuilder sb = new StringBuilder();
        int i=0;
br.close();
        while (fileReader.ready())sb.append((char) fileReader.read());
fileReader.close();
        Pattern pattern=Pattern.compile("\\bworld\\b");
        Matcher matcher=pattern.matcher(sb);

        while (matcher.find()) {i++;}
        System.out.println(i);

    }
}
