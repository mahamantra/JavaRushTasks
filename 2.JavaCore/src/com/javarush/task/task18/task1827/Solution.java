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

        for (int i = 1; i <args.length-3 ; i++) {
            productName.append(args[i]+" ");
        }

        System.out.println(quantity);
        quantity.append(" ".repeat(4-quantity.length()));
        price.append(" ".repeat(8-price.length()));
        productName.append(" ".repeat(30-productName.length()));

        System.out.println(quantity);
        System.out.println(price);
        System.out.println(productName);

        StringBuilder data=new StringBuilder();
        data.append(productName).append(price).append(quantity).append("\n");

        System.out.println(data);

        bufferedWriter.write(data.toString());
        bufferedWriter.close();


    }
}
