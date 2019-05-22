package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(args[0]);
        BufferedReader bfr=new BufferedReader(fr);
        FileWriter fw = new FileWriter(args[1]);
        StringBuilder sb = new StringBuilder();
        int i;
        char c;
        String n;
        while (bfr.ready())sb.append(bfr.readLine()+" ");

      // System.out.println(sb);
        n=sb.toString();
        n=n.trim();
        String[] strings=n.split(" ");


        sb.setLength(0);

        for (String string : strings) {
            if (string.length()>6) sb.append(string+",");
        }
        sb.setLength(sb.length()-1);
        fw.write(sb.toString());

//        n="";
//        for (int j = 0; j <strings.length; j++) {
//            if (strings[j].length()>6){
//                if(j==strings.length-2){n=n+strings[j];}
//            else n=n+strings[j]+",";}
//        }

       // System.out.println(sb);
        fr.close();
        fw.close();




    }
}
