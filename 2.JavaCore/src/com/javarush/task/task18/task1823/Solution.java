package com.javarush.task.task18.task1823;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Нити и байты
*/

public class Solution {
    public  static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner=new Scanner(System.in);
        String s;
        while (true){
            s=scanner.nextLine();
            if (s.equals("exit"))break;
            else new ReadThread(s).start();
        }
        scanner.close();

       // System.out.println(resultMap);

    }

    public static class ReadThread extends Thread {

        private String filename;

        public ReadThread(String fileName) {
            this.filename=fileName;

        }

        @Override
        public void run() {
            int i=0,a,buf,max=1;
HashMap<Integer,Integer> map=new HashMap<>();
            try {
                FileInputStream fis=new FileInputStream(filename);
                //i=fis.read();

                while (fis.available()>0){
                    a=fis.read();
                    if(map.containsKey(a)){
                        buf=map.get(a);
                        buf++;
                        if (buf>max)max=buf;
                        map.put(a,buf);
                    }
                    else map.put(a,1);
                }
                fis.close();
                } catch (Exception e1) {
                e1.printStackTrace();
            }
            //System.out.println(map);
           // System.out.println(max);
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue()==max)resultMap.put(filename,entry.getKey());
            }


        }



    }
}
