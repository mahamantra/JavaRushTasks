package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> list=new HashMap<>();
        int id;
        String name;

        while (true){
         try {
             id=Integer.parseInt(reader.readLine());
         }catch (Exception e) {break;}


            name=reader.readLine();
            if(name.equals(""))break;
            list.put(name,id);
        }
        for (Map.Entry<String, Integer> entry : list.entrySet()) {
            System.out.println(entry.getValue()+" "+entry.getKey());

        }


    }
}
