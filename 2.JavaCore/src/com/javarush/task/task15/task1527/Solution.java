package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();

        s=s.replaceAll("^[^?]+\\?","");
        String[] strings=s.split("&");

        Double d;
        for (String string : strings) {
            string=string.replaceAll("=[^=]+$","");

            System.out.print(string+" ");
        }
        System.out.println();

        for (String string : strings) {
            if (string.contains("obj")) {
                string=string.replaceAll("^[^=]+=","");
                try {
                    d=Double.parseDouble(string);
                    alert(d);
                } catch (NumberFormatException e) {
                    alert(string);
                }

                }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
