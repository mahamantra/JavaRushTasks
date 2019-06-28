package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("f1");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        StringBuilder s = new StringBuilder();

        while (bufferedReader.ready()) {
            s.append(bufferedReader.readLine());
        }

        returnList(s);

        System.out.println(s);
    }

    public static List<String> returnList(StringBuilder stringBuilder) {
        List<String> listTeg = new ArrayList<>();
        List<Integer> numberOpen = new ArrayList<>();
        List<Integer> numberClose = new ArrayList<>();
        Map<Integer,Integer > mapResult=new TreeMap<>() ;
        String s;

        for (int i = 0; i < stringBuilder.length(); i++) {
            i = stringBuilder.indexOf("</", i);
            if (i < 0) break;
            numberClose.add(i);
        }

        for (int i = 0; i < stringBuilder.length(); i++) {
            i = stringBuilder.indexOf("<", i);
            if (i < 0) break;
            if (!numberClose.contains(i)) numberOpen.add(i);
        }

        for (Integer i :numberOpen
                ) {
            mapResult.put(i,0);
        }

        for (Integer i :numberClose
                ) {
            mapResult.put(i,1);
        }


        for (:
             ) {
            
        }
        // s = stringBuilder.substring(numberOpen.get(0), numberClose.get(0));
        // System.out.println(s);
        return listTeg;
    }
}
