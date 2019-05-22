package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> strings=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {strings.add(scanner.nextLine());
        }
        int min=0;

        for (int i = 0; i <strings.size() ; i++) {if (i==0)min=strings.get(0).length();else if(min>strings.get(i).length())min=strings.get(i).length();

        }
        for (String i:strings
             ) {if (i.length()==min) System.out.println(i);

        }


    }
}
