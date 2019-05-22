package com.javarush.task.task18.task1801;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        FileInputStream fis=new FileInputStream(scanner.nextLine());
        int max=0,n=0;
        while (fis.available()>0){

            n=fis.read();
            if(n>max)max=n;
        }
        fis.close();
        System.out.println(max);
    }
}
