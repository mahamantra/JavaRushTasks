package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> hashMap=new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hashMap.put("Kim"+i,"Fjkhkjh");

        }
        return hashMap;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        List<String> a=new LinkedList<>();
        int i=0;
        for (Map.Entry<String, String> stringStringEntry : copy.entrySet()) {i=0;
            for (Map.Entry<String, String> stringEntry : map.entrySet()) {
                if (stringStringEntry.getValue()==stringEntry.getValue()){i++;if (i==2) a.add(stringStringEntry.getValue()); }
            }

        }

        for (String s : a) {removeItemFromMapByValue(map,s);

        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {removeTheFirstNameDuplicates(createMap());

    }
}
