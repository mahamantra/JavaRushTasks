package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> hashMap=new HashMap<>();
        for (int i = 0; i < 10; i++) {hashMap.put("Ким"+i,"Игорь"+i);

        }
return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int i=0;
        for (String s : map.values()) {if (s.equals(name))i++;
            
        }
return i;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int i=0;
        for (String s : map.keySet()) {if (s.equals(lastName))i++;

        }
        return i;
    }

    public static void main(String[] args) {

    }
}
