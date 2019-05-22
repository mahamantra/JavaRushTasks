package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        long startTime = System.currentTimeMillis();

        ArrayList<Integer> listData = new ArrayList<Integer>();
        while (inputStream.available() > 0) listData.add(inputStream.read());
        inputStream.close();
        ArrayList<Integer> result = new ArrayList<Integer>(new HashSet<Integer>(listData));
        Collections.sort(result);

        while (!result.isEmpty()) {
            System.out.print(result.get(result.size()-1) + " ");
            result.remove(result.get(result.size()-1));
        }

        long finishTime = System.currentTimeMillis();
        System.out.println("\nвремя работы=" + (finishTime-startTime) + "ms.");
    }
}