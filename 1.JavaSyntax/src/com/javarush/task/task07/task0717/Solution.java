package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        ArrayList <String> list=new ArrayList<>();
        for (int i = 0; i++< 10;list.add(scanner.nextLine())) {

        }

        ArrayList<String> result = doubleValues(list);

        for (String i:result
             ) {
            System.out.println(i);

        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i <list.size(); i+=2) {list.add(i,list.get(i));

        }
        return list;
    }
}
