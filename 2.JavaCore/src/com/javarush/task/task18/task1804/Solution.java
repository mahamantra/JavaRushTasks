package com.javarush.task.task18.task1804;

import java.io.File;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        FileInputStream fis=new FileInputStream(new File(scanner.nextLine()));

        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int crrentByte=0;

        while (fis.available()>0){
            crrentByte=fis.read();
            hashMap.merge(crrentByte,1,Integer::sum);

        }
        fis.close();
        int i=Collections.min(hashMap.values());

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue()==i)
            System.out.print(entry.getKey()+" ");
        }
    }
}
