package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings= new ArrayList<>();
    private static List<String> strings1= new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i <5; i++) {
            strings.add(scanner.nextLine());
        }
        for (int i = 0; i <strings.size(); i++) {if (i==0) strings1.add(0,strings.get(0));
                                                     else if (strings.get(i).length()>strings1.get(0).length()) strings1.set(0,strings.get(i));

        }
        for (String i:strings
             ) {if (i.length()==strings1.get(0).length()) strings1.add(i);

        }
        strings1.remove(0);

        for (String i:strings1
             ) {
            System.out.println(i);

        }
        }
        }





