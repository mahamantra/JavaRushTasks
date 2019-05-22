package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        Scanner scanner=new Scanner(System.in);
        firstFileName=scanner.nextLine();
        secondFileName=scanner.nextLine();
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface{
        String fileName;
        ArrayList<String> strings=new ArrayList<>();

        @Override
        public void setFileName(String fullFileName) {
            fileName=fullFileName;
        }

        @Override
        public String getFileContent() {
            String s="";
            for (String string : strings) {
                s+=" "+string;
            }
            return s;
        }

        public void run(){
          try{  FileReader reader=new FileReader(fileName);
            BufferedReader bufferedReader=new BufferedReader(reader);
            while (bufferedReader.ready()){
                strings.add(bufferedReader.readLine());}


            }catch (Exception e){}
        }
    }
}
