package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        FileReader fr=new FileReader(br.readLine());
        BufferedReader bufferedReader=new BufferedReader(fr);
        StringBuilder sb1=new StringBuilder();

        while (bufferedReader.ready()){
            StringBuilder sb=new StringBuilder();
            sb.append(bufferedReader.readLine());
            sb.reverse();
            System.out.println(sb);

        }

        br.close();
        fr.close();
        String s;


    }
}
