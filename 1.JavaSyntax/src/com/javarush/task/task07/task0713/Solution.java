package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <Integer> main=new ArrayList<>(),a3=new ArrayList<>(),a2=new ArrayList<>(),any=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in    ));

        for (int i = 0; i < 20; i++) {main.add(Integer.parseInt(reader.readLine()));
            if (main.get(i)%3==0)a3.add(main.get(i));
            if (main.get(i)%2==0)a2.add(main.get(i));
            if (main.get(i)%2!=0&main.get(i)%3!=0)any.add(main.get(i));

        }
printList(main);printList(a2);printList(a3);printList(any);
    }

    public static void printList(List<Integer> list) {
        for (Integer i:list
             ) {
            System.out.println(i);

        }
    }
}
