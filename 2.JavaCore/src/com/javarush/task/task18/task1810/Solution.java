package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        Scanner scanner=new Scanner(System.in);

        while (true){
            try {
                FileInputStream fis=new FileInputStream(scanner.nextLine());
                if (fis.available()<1000){
                    fis.close();
                    throw new DownloadException();}
            } catch (IOException e) {
                System.out.println(e);
            }
        }

    }

    public static class DownloadException extends Exception {

    }
}
