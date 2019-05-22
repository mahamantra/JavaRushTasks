package com.javarush.task.task22.task2211;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream(args[0]);
        FileOutputStream fos=new FileOutputStream(args[1]);

        while (fis.available()>0){
            byte [] bytes=new byte[1000];
            fis.read(bytes);
            String s=new String(bytes,"Windows-1251");
            bytes=s.getBytes("UTF-8");
            fos.write(bytes);
        }

        fis.close();
        fos.close();

    }
}
