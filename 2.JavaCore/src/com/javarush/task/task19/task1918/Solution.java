package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    static String teg ;

    public static void main(String[] args) throws IOException {
        teg=args[0];
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader buffer=new BufferedReader(inputStreamReader);
        FileReader fileReader = new FileReader(buffer.readLine());
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        StringBuilder s = new StringBuilder();

        while (bufferedReader.ready()) {
            s.append(bufferedReader.readLine());
        }

        buffer.close();
        fileReader.close();
        bufferedReader.close();
        returnList(s);

    }

    public static List<String> returnList(StringBuilder stringBuilder) {
        List<String> listTeg = new ArrayList<>();

        String s = stringBuilder.toString();
        int j = 0;

        while (j < s.length()) {
            List<Integer> numberOpen = new ArrayList<>();
            List<Integer> numberClose = new ArrayList<>();
            for (int i = j; i < s.length(); i++) {

                if (s.charAt(i) == 60) {
                    if (s.substring(i + 1, teg.length() + i + 1).equals(teg)) {
                        numberOpen.add(i);
                    } else if ((s.substring(i + 1, teg.length() + i + 2)).equals("/" + teg) && numberOpen.size() > 0)
                        numberClose.add(i);

                    if (numberClose.size() == numberOpen.size() && numberOpen.size() > 0) break;

                }

            }
            if (numberOpen.size() > 0) {
                //System.out.println(numberOpen);
                //System.out.println(numberClose);
                j = numberOpen.get(0) + 1;
               // System.out.println(j);
                System.out.println(s.substring(numberOpen.get(0), (numberClose.get(numberOpen.size() - 1) + teg.length() + 3)));
            }else break;
        }


        return listTeg;
    }


}
