package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Solution {
    static {
        FileReader reader= null;
        try {
            reader = new FileReader(Statics.FILE_NAME);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner=new Scanner(reader);
        //lines//= new ArrayList<String>();

        while (scanner.hasNextLine()){
            String s;
            s=scanner.nextLine();
            Solution.lines.add(s);
        }
        scanner.close();
    }


    public static List<String> lines=new ArrayList<String>();


    public static void main(String[] args) throws Exception{
        System.out.println(lines);
    }
}
