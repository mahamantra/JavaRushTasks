package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer=new BufferedWriter(new FileWriter(reader.readLine()));
            String string;

            do {string=reader.readLine();
            writer.write(string+"\n");
          //  writer.flush();


            } while (!(string.equals("exit")));
            reader.close();
            writer.close();

        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
