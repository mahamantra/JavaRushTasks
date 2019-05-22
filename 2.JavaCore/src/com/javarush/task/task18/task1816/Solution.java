package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fis=new FileInputStream(args[0]);
        BufferedReader reader=new BufferedReader(new InputStreamReader(fis));
        StringBuilder string=new StringBuilder();
        while (reader.ready()) {
            string.append(reader.readLine()+"\n");
        }
        fis.close();
        Pattern pattern=Pattern.compile("[A-za-z]");
        Matcher m=pattern.matcher(string);
        int count=0;
        while (m.find()){
          count++;
        }
        System.out.println(count);
    }
}
