package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args)throws Exception {
        Scanner scanner=new Scanner(System.in);
        FileInputStream fileInputStream = new FileInputStream(scanner.nextLine());
        InputStreamReader isr=new InputStreamReader(fileInputStream);
        BufferedReader  bufferedReader=new BufferedReader(isr);
        int s=0;
        List<Integer> list=new ArrayList<>();

        while (bufferedReader.ready()){

           s= Integer.parseInt(bufferedReader.readLine());
            if (s%2==0) list.add(s);
        }
        bufferedReader.close();
        scanner.close();

        Collections.sort(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
