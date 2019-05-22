package com.javarush.task.task09.task0929;

import java.io.*;

/* 
Обогатим код функциональностью!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        String sourceFileName = reader.readLine();
//        String destinationFileName = reader.readLine();
        InputStream fileInputStream;
        while(true) {
            try{
            fileInputStream = getInputStream(reader.readLine());break;}
            catch (Exception e){
                System.out.println("Файл не существует.");
            }
        }
        OutputStream fileOutputStream = getOutputStream(reader.readLine());

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

