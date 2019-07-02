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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    static String teg="span";
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

        String s=stringBuilder.toString();
        int j=0;

       while (j<s.length()) {
           List<Integer> numberOpen = new ArrayList<>();
           List<Integer> numberClose = new ArrayList<>();
           for (int i = j; i < s.length(); i++) {

               if (s.charAt(i) == 60) {
                   if (s.charAt(i + 1) == 47&&numberOpen.size()>0) {
                       numberClose.add(i);
                   } else numberOpen.add(i);
                   if (numberClose.size() == numberOpen.size()) break;

               }

           }
           System.out.println(numberOpen);
           System.out.println(numberClose);
           System.out.println(s.substring(numberOpen.get(0),numberClose.get(numberClose.size()-1)+teg.length()+3));
           j=numberOpen.get(0)+1;
           System.out.println(j);

       }



        return listTeg;
    }


}
