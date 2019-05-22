package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        FileOutputStream fos1=new FileOutputStream(scanner.nextLine(),true);
        FileInputStream fis2=new FileInputStream(scanner.nextLine());
        FileInputStream fis3=new FileInputStream(scanner.nextLine());

        byte[] file2=new byte[fis2.available()];
        fis2.read(file2);
        byte[] file3=new byte[fis3.available()];
        fis3.read(file3);

        fos1.write(file2);
        fos1.write(file3);

        fos1.close();
        fis2.close();
        fis3.close();



    }
}
