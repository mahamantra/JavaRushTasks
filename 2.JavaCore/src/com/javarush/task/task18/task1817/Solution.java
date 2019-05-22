package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream(args[0]);
        int a,countS=fis.available(),countP=0;

        while (fis.available()>0){
            a=fis.read();
           if (a==32)countP++;

        }
        fis.close();
       // System.out.println(countP);
       // System.out.println(countS);
        float result=(float) countP/countS*100;
        float newDouble = new BigDecimal(result).setScale(5, RoundingMode.HALF_UP).floatValue();
        System.out.println(newDouble);
        System.out.println(String.format(Locale.ENGLISH,"%(.2f",(float) countP/countS*100));


    }
}
