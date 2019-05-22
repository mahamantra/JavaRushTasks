package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
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
        Map<String,Double> map=new TreeMap<>();
        System.out.println(new FileReader(args[0]).getEncoding());
        while (br.ready()){
            String[] strings=br.readLine().split(" ");
            if (map.containsKey(strings[0]))map.put(strings[0],Double.parseDouble(strings[1])+map.get(strings[0]));
            else map.put(strings[0],Double.parseDouble(strings[1]));


        }
        br.close();
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue().toString());
        }


    }
}
