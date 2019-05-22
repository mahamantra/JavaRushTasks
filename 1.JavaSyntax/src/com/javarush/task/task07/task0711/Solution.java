package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> strings=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        for  (  int i = 0; i < 5; i++) {strings.add(scanner.nextLine());

        }
        for (int i = 0; i < 13; i++) {strings.add(0,strings.get(4));strings.remove(5);

        }
        for (String i:strings
             ) {
            System.out.println(i);

        }
    }
}
