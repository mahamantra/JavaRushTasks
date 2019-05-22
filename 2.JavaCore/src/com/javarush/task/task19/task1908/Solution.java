package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        File file1=new File(br.readLine());
        File file2=new File(br.readLine());
        br.close();

        BufferedReader brf=new BufferedReader(new FileReader(file1));
        BufferedWriter bwf=new BufferedWriter(new FileWriter(file2));

        StringBuilder sb=new StringBuilder();

        while (brf.ready())sb.append(brf.readLine());
        String s=sb.toString();
        System.out.println(s);

        Pattern pattern=Pattern.compile("\\b\\d*\\b");
        Matcher matcher=pattern.matcher(sb);


        while (matcher.find()) {
            s=matcher.group();
        if (!s.equals("")) bwf.write(s+" ");}
        brf.close();
        bwf.close();


    }
}
