package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.FileInputStream;
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        File file=new File(new Scanner(System.in).nextLine());
        FileInputStream fis=new FileInputStream(file);
        byte[] bytes=new byte[fis.available()];
        fis.read(bytes);
        fis.close();
        int count=0;
        for (byte aByte : bytes) {
            if(aByte==44)count++;
           // System.out.println(aByte);
        }

        System.out.println(count);
    }
}
