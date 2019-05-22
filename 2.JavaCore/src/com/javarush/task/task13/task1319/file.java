package com.javarush.task.task13.task1319;

import java.io.*;

public class file {
    public static void main(String[] args) {


        try {
            FileWriter writer = new FileWriter("text.txt",true);
            writer.write("asdfasdf \n");
            writer.close();
        } catch (Exception e){ System.out.println(e);  }

    }
}
