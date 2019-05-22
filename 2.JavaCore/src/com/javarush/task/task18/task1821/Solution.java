package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream(args[0]);
        int[] bytes=new int[256];
        int i=0;

        while (fis.available()>0){
            i=fis.read();
            bytes[i]++;
        }
        fis.close();
        for (int j = 0; j <256; j++) {
            if (bytes[j]!=0) System.out.println( j+" "+bytes[j]);
        }

    }
}
