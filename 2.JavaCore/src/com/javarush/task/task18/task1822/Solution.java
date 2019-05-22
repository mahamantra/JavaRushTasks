package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader br=new BufferedReader(
                new InputStreamReader(new FileInputStream(new File(new Scanner(System.in).nextLine()))));
        String s;

        while (br.ready()){
            s=br.readLine();
            Pattern pattern=Pattern.compile("^\\S+");
            Matcher matcher=pattern.matcher(s);
            matcher.find();
            if (matcher.group().equals(args[0])) System.out.println(s);
        }
        br.close();
    }
}
