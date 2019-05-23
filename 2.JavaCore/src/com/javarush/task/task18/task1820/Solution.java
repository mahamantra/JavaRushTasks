package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        File file1=new File(scanner.nextLine());
        File file2=new File(scanner.nextLine());


        FileInputStream fis1=new FileInputStream(file1);
        int buf;
        StringBuilder sb=new StringBuilder();
        ArrayList<String> strings=new ArrayList<>();
        ArrayList<Double> doubles=new ArrayList<>();

        while (fis1.available()>0){
            buf=fis1.read();
            if (buf==(char)' '){strings.add(sb.toString());sb=new StringBuilder();}
            else {sb.append((char) buf);if (fis1.available()==0)strings.add(sb.toString());}
        }
        fis1.close();
        for (String string : strings) {
            doubles.add(Double.parseDouble(string));
        }

        FileOutputStream fos=new FileOutputStream(file2);
//        OutputStreamWriter osw=new OutputStreamWriter(fos);
//        BufferedWriter bw=new BufferedWriter(osw);

        for (Double aDouble : doubles) {
            fos.write(((int) Math.round(aDouble)+" ").getBytes());
        }

       // bw.close();

    }
}
