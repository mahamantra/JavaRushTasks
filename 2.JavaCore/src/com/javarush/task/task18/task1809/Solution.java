package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        File file= new File(new Scanner(System.in).nextLine());
        File file2= new File(new Scanner(System.in).nextLine());

        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(file2);

        byte[] bytes=new byte[fis.available()];
        fis.read(bytes);
        for (int i = bytes.length-1; i >=0 ; i--) {
            fos.write(bytes[i]);

        }
        fis.close();
        fos.close();

    }
}
