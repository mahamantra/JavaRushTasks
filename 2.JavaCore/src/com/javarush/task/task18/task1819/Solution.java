package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        File A=new File(scanner.nextLine());
        File B=new File(scanner.nextLine());

        FileInputStream fis1=new FileInputStream(A);
        FileInputStream fis2=new FileInputStream(B);

        byte[] file2=new byte[fis2.available()];
        fis2.read(file2);
        fis2.close();
        byte[] file1=new byte[fis1.available()];
        fis1.read(file1);
        fis1.close();

        FileOutputStream fos1=new FileOutputStream(A);


        fos1.write(file2);
        fos1.write(file1);

        fos1.close();


    }
}
