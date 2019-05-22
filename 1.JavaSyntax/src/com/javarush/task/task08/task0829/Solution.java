package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,String> map=new HashMap<>();
        String k,v;
        while (true){
            k=reader.readLine();
            if (k.isEmpty()) break;
            v=reader.readLine();
            if (v.isEmpty()) break;
              else map.put(k,v);
        }
k=reader.readLine();
        for (Map.Entry<String, String> entry : map.entrySet()) {if (entry.getKey().equals(k)) System.out.println(entry.getValue());

        }
    }
}
