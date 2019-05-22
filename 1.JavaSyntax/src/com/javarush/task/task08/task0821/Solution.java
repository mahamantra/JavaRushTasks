package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String,String> map=new HashMap<>();
        map.put("Petrov","Ivan");
        map.put("Petrov","Oleg");
        map.put("Ivanov","Petr");
        map.put("Sidorov","Petr");
        map.put("Sidorovv","Petr");
        map.put("Sidorovvf","Petr");
        map.put("Sidorovvff","Petr");
        map.put("Sidorovvff1","Petr");
        map.put("Sidorovvff2","Petr");
        map.put("Sidorovvff3","Petr");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
