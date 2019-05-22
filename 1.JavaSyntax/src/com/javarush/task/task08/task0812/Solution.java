package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> integers=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
int a,b=1,c=1;

        for (int i = 0; i <10 ; i++) {a=Integer.parseInt(reader.readLine());integers.add(a);
           if (i==0)c=1;
            else if (a==integers.get(integers.size()-2)) c++;
            else c=1;
             if (c>b) b=c;

        }

        System.out.println(b);

    }
}