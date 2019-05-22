package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args)throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
       // String s="c:/11/1.txt";
        InputStream stream=new FileInputStream(s);
        while (stream.available()>0){
            int data=stream.read();

             System.out.print((char) data);
        }
        System.out.println();
        stream.close();
        reader.close();
    }
}