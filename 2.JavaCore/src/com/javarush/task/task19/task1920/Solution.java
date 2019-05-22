package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader(args[0]));
        String[] strings=new String[2];
        Map<String,Double> map=new TreeMap<>();
        Double max=Double.MIN_VALUE;

        while (br.ready()){
            strings=br.readLine().split(" ");
            if(map.containsKey(strings[0]))map.put(strings[0],map.get(strings[0])+Double.parseDouble(strings[1]));
            else map.put(strings[0],Double.parseDouble(strings[1]));

        }br.close();

        for (Double aDouble : map.values()) {
            if(max<aDouble)max=aDouble;
        }

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if(entry.getValue().equals(max)) System.out.println(entry.getKey());
        }

        //System.out.println(map);
    }
}
