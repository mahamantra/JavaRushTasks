package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> s=new ArrayList <String>();
        for (int i = 0; i <5 ; i++) {s.add("ф");

        }
        System.out.println(s.size());

        for (int i = 0; i <s.size() ; i++) {
            System.out.println(s.get(i));

        }
    }
}
