package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
Map<String,String> a=new HashMap<>();
a.put("name","Ivanov");
a.put("country","Ukraine");
a.put("city","Kiev");
a.put("age",null);
        System.out.println(getQuery(a));

    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder sb=new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if(entry.getValue()!=null)sb.append(entry.getKey()+" = "+"'"+entry.getValue()+"'"+" and ");
        }
        if (sb.length()>0)sb.setLength(sb.length()-5);
        return sb.toString();
    }
}
