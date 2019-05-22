package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        BufferedReader fr=new BufferedReader(new FileReader(br.readLine()));
        BufferedWriter fw=new BufferedWriter(new FileWriter(br.readLine()));
        br.close();
        StringBuilder stringBuilder=new StringBuilder();

        while (fr.ready()){
            stringBuilder.append(fr.readLine());
        }
        fr.close();

        String s=stringBuilder.toString();
        s=s.replaceAll("\\p{Punct}","");
        //System.out.println(s);
        fw.write(s);
        fw.close();
    }
}
