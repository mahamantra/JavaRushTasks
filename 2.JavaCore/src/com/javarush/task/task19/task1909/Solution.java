package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br1=new BufferedReader(new FileReader(br.readLine()));
        BufferedWriter bw=new BufferedWriter(new FileWriter(br.readLine()));

        StringBuilder stringBuilder=new StringBuilder();

        while (br1.ready())stringBuilder.append(br1.readLine());

        String s=stringBuilder.toString();
        String s1 = s.replaceAll("\\.", "!");

        bw.write(s1);
        br.close();
        br1.close();
        bw.close();

    }
}
