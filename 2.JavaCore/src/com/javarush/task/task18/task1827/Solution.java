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

       if (args.length!=0) {
           StringBuilder quantity = new StringBuilder(args[args.length - 1]);
           StringBuilder price = new StringBuilder(args[args.length - 2]);
           StringBuilder productName = new StringBuilder();

           StringBuilder id = new StringBuilder(returnMaxID());


           for (int i = 1; i <= args.length - 3; i++) {
               productName.append(args[i] + " ");
           }
            productName.deleteCharAt(productName.length()-1);

           for (int i = 0; i <(4 - quantity.length()) ; ) {
               quantity.append(" ");
           }
           for (int i = 0; i <(8 - price.length()) ; ) {
               price.append(" ");
           }
           for (int i = 0; i <(30 - productName.length()) ; ) {
               productName.append(" ");
           }

           //quantity.append(" ".repeat(4 - quantity.length()));
           //price.append(" ".repeat(8 - price.length()));
           //productName.append(" ".repeat(30 - productName.length()));
           //id.append(" ".repeat(8-productName.length()));

//        System.out.println(quantity.length());
//        System.out.println(price.length());
//        System.out.println(productName.length());

           StringBuilder data = new StringBuilder();
           data.append(id).append(productName).append(price).append(quantity).append("\n");


           bufferedWriter.write(data.toString());
       }

        bufferedWriter.close();

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
