package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0,"ноль");
        map.put(1,"один");
        map.put(2,"два");
        map.put(3,"три");
        map.put(4,"четыре");
        map.put(5,"пять");
        map.put(6,"шесть");
        map.put(7,"семь");
        map.put(8,"восемь");
        map.put(9,"девять");
        map.put(10,"десять");
        map.put(11,"одиннадцать");
        map.put(12,"двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        FileReader fr=new FileReader(br.readLine());
        br.close();

        StringBuilder sb=new StringBuilder();
        while (fr.ready()){
            sb.append((char) fr.read());
        }
        fr.close();
        //System.out.println(sb);


//        for (int i=10;i>0;i--) {
//            Pattern pattern=Pattern.compile("\\b\\d[120]?\\b");
//            Matcher matcher=pattern.matcher(sb);
//
//            matcher.find();
//                sb.replace(matcher.start(),matcher.end(),map.get(Integer.parseInt(matcher.group())));
//                System.out.println(sb.toString());
//
//
//
//                //System.out.println( map.get(Integer.parseInt(matcher.group())));
//
//        }

        while (true){
            Pattern pattern=Pattern.compile("\\b\\d[120]?\\b");
            Matcher matcher=pattern.matcher(sb);


              if  (!matcher.find())break;

            sb.replace(matcher.start(),matcher.end(),map.get(Integer.parseInt(matcher.group())));
                //System.out.println(sb.toString());



                //System.out.println( map.get(Integer.parseInt(matcher.group())));

        }
        System.out.println(sb.toString());


    }
}
