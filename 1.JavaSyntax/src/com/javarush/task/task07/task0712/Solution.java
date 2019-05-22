package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       ArrayList <String> strings=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        String max="",min="";

        for (int i = 0; i < 10; i++) {strings.add(scanner.nextLine());if (i==0  )max=min=strings.get(0);
                                                                            else if (max.length()<strings.get(i).length()) max=strings.get(i);
                                                                                 else if (min.length()>strings.get(i).length()) min=strings.get(i);

        }

        int i=0;
        while (!strings.get(i).equals(max)&!strings.get(i).equals(min)){  i++;}
        System.out.println(strings.get(i));
    }
}
