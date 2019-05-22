package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader=new BufferedReader(new FileReader(br.readLine()));
        br.close();
        String s;

        while (bufferedReader.ready()){
            s=bufferedReader.readLine();
           int count=0;

            for (String word : words) {
                Matcher matcher= Pattern.compile("\\b"+word+"\\b").matcher(s);
               while (matcher.find())count++;
            }

            if (count==2) System.out.println(s);

        }

        bufferedReader.close();

    }
}
