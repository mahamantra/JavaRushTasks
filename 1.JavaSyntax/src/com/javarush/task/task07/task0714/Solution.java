package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> strings=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i < 5; i++) {strings.add(scanner.nextLine());

        }
        strings.remove(2);
        for (int i = 0; i <strings.size(); i++) {
            System.out.println(strings.get(strings.size()-i-1));

        }
    }
}


