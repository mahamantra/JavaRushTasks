package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;


    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int i=Integer.parseInt(reader.readLine());
        String n = Integer.toString(i);
        char[] charArray = n.toCharArray();

        for (Character q:charArray) {
            if (q%2==0) even++;
                    else odd++;}
        System.out.println("Even: "+even+ " Odd: "+odd);
    }







    }

