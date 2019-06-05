package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Writer writer=new FileWriter(new Scanner(System.in).nextLine(),true);
       BufferedWriter bufferedWriter=new BufferedWriter(writer);

       if (args.length!=0 && args[0].equals("-c") ){
           StringBuilder quantity = new StringBuilder((args[args.length - 1]+"                                                 ").substring(0,4));
           StringBuilder price = new StringBuilder((args[args.length - 2]+"                                                 ").substring(0,8));
           StringBuilder productName = new StringBuilder((args[1]+"                                                 ").substring(0,30));



           StringBuilder id = new StringBuilder(returnMaxID());


           String data = String.format("%s%s%s%s",id,productName,price,quantity);
           System.out.println(data+"!!!!");


           bufferedWriter.write(data+System.lineSeparator());
           bufferedWriter.close();

       }

writer.close();



    }

    private static String returnMaxID() throws IOException {
        FileReader fileReader=new FileReader("f1");
        BufferedReader bufferedReader=new BufferedReader(fileReader);

        String s="1";
        int max=0,i=0;

        while (bufferedReader.ready()){
            s=bufferedReader.readLine();
            s=s.substring(0,8);
            i=Integer.parseInt(s.trim());

            if (max<i)max=i;
         }

        max++;
        bufferedReader.close();
        s=String.valueOf(max);
        for (int t = 0; t <(8 - s.length()) ; ) {
            s=s+" ";
        }

        return s;
    }
}
