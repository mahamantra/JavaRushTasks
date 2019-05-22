package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        for (int i = 0; i <10; i++) {
            map.put("Stallone"+i, new Date("JUNE 1 1980"));
        }

     return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        HashMap<String,Date>temp=new HashMap<>();

        for (Map.Entry<String, Date> stringDateEntry : map.entrySet()) {
            if (stringDateEntry.getValue().getMonth()>=5&stringDateEntry.getValue().getMonth()<=7) temp.put(stringDateEntry.getKey(),stringDateEntry.getValue());

        }
//        for (Map.Entry<String, Date> entry : temp.entrySet()) {
//            System.out.println(entry.getKey());
//        }
        for (String s : temp.keySet()) {map.remove(s);

        }

    }

    public static void main(String[] args) {
HashMap<String,Date> map=new HashMap<>();
map=createMap();
removeAllSummerPeople(map);

//        for (Map.Entry<String, Date> entry : map.entrySet()) {
//            System.out.print(entry.getKey()+"  ");
//            System.out.println(entry.getValue().getMonth());
//
//        }

    }
}
