package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);

        while (true){
            File file=new File(scanner.nextLine());

            try {
                FileInputStream fis=new FileInputStream(file);
                fis.close();
            } catch (FileNotFoundException e) {
                System.out.println(file);
                break;
            }
        }
        scanner.close();

    }
}
