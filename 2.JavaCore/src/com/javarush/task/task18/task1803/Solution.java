package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine() );
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=0,i=0,max=0;

        while (fis.available()>0){
            n=fis.read();
            if (map.containsKey(n)){
                i=map.get(n);
                map.put(n,++i);
                if (i>max)max=i;}
            else map.put(n,1);
        }
        fis.close();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()==max) System.out.print(entry.getKey()+" ");
            //System.out.println(entry.getKey()+":"+entry.getValue()+"max="+max);
        }
    }
}
