package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        File file=new File(reader.readLine());
        FileInputStream fis=new FileInputStream(file);
        int max=fis.read(),n;
        while (fis.available()>0){
            if((n=fis.read())<max)max=n;
        }
        fis.close();
        System.out.println(max);
    }
}
