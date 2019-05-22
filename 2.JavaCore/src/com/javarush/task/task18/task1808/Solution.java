package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        File file1=new File(scanner.nextLine());
        File file2=new File(scanner.nextLine());
        File file3=new File(scanner.nextLine());

        FileInputStream fis=new FileInputStream(file1);
        FileOutputStream fos1=new FileOutputStream(file2);
        FileOutputStream fos2=new FileOutputStream(file3);

        byte[] bytes=new byte[fis.available()];
        fis.read(bytes);

        if (bytes.length%2==0){
            fos1.write(bytes,0,bytes.length/2);
            fos2.write(bytes,bytes.length/2,bytes.length/2);
        }
        else {fos1.write(bytes,0,bytes.length/2+1);
            fos2.write(bytes,bytes.length/2+1,bytes.length/2);
        }

        fis.close();
        fos1.close();
        fos2.close();



    }
}
