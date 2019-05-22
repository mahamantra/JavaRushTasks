package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args[0].equals("-e"))Solution.e(args[1],args[2]);
        if (args[0].equals("-d"))Solution.d(args[1],args[2]);

    }

    static void e(String file1,String file2) throws IOException {
        FileInputStream fis=new FileInputStream(file1);
        FileOutputStream fos=new FileOutputStream(file2);
        int n;
        while (fis.available()>0){
          n=fis.read();
          fos.write(n+1);

        }
        fis.close();
        fos.close();
    }

    static void d(String file1,String file2) throws IOException {
        FileInputStream fis=new FileInputStream(file1);
        FileOutputStream fos=new FileOutputStream(file2);
        int n;
        while (fis.available()>0){
          n=fis.read();
          fos.write(n-1);

        }
        fis.close();
        fos.close();

    }

}



