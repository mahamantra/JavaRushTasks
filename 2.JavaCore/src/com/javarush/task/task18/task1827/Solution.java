package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        Writer writer=new FileWriter("f1",true);
        BufferedWriter bufferedWriter=new BufferedWriter(writer);

       StringBuilder quantity=new StringBuilder( args[args.length-1]);
       StringBuilder price=new StringBuilder( args[args.length-2]);
       StringBuilder productName=new StringBuilder();

       StringBuilder id=new StringBuilder(returnMaxID());


        for (int i = 1; i <args.length-2 ; i++) {
            productName.append(args[i]+" ");
        }
        productName.deleteCharAt(productName.length()-1);

        quantity.append(" ".repeat(4-quantity.length()));
        price.append(" ".repeat(8-price.length()));
        productName.append(" ".repeat(30-productName.length()));
        id.append(" ".repeat(8-productName.length()));

        System.out.println(quantity.length());
        System.out.println(price.length());
        System.out.println(productName.length());

        StringBuilder data=new StringBuilder();
        data.append(id).append(productName).append(price).append(quantity).append("\n");

        System.out.println(data);

        bufferedWriter.write(data.toString());
        bufferedWriter.close();

        returnMaxID();

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

        return String.valueOf(max);
    }
}
