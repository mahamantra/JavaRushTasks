package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String,Integer> map=new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("name"+i,(int)(Math.random()*1000));

        }
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String,Integer> copy=new HashMap<>(map);
        for (Map.Entry<String, Integer> entry : copy.entrySet()) {
            if (entry.getValue()<500) map.remove(entry.getKey());

        }
    }

    public static void main(String[] args) {
               }

    }
