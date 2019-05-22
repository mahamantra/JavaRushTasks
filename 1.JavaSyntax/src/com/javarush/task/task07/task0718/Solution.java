package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> s=new ArrayList<>();

        for (int i = 0; i < 10; i++) {s.add(scanner.nextLine());

        }
        for (int i = 1; i <s.size(); i++) {if (s.get(i).length()<s.get(i-1).length()) {System.out.println(i);break;}

        }
    }
}

