package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Требования:
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        String s;
        while (true){
            s=scanner.nextLine();
            if(s.equals("end"))break;
            strings.add(s);
        }

        s=strings.get(0);

        s=s.replaceAll("\\.\\w+\\d+$","");
        BufferedWriter bfw=new BufferedWriter(new FileWriter(s,true));


        Map<Integer,String > map =new TreeMap<>();
        for (String string : strings) {
            Matcher matcher= Pattern.compile("\\d+$").matcher(string);
           while (matcher.find()){
            s=matcher.group();}
            map.put(Integer.parseInt(s),string);
        }

        BufferedReader bfr;

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            bfr=new BufferedReader(new FileReader(entry.getValue()));
            while (bfr.ready())bfw.write(bfr.readLine());
            bfr.close();
        }
bfw.close();
    }
}
