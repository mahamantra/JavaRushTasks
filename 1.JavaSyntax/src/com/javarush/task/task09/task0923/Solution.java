package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine(),sVowel="",sNot="";



        char[] c=s.toCharArray();

        for (int i = 0; i <c.length ; i++) {


            if (c[i] == 32) i++;
            if (isVowel(c[i])) sVowel = sVowel + c[i] + " ";
            else sNot = sNot + c[i] + " ";
        }
        System.out.println(sVowel);
        System.out.println(sNot);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}