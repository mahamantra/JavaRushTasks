package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.*;

/* 
4. Метод save должен сохранять карту properties в полученный в качестве параметра объект типа OutputStream.
5. Метод load должен восстанавливать состояние карты properties из полученного в качестве параметра объекта типа InputStream.
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        Scanner scanner=new Scanner(System.in);
        FileInputStream fis=new FileInputStream(scanner.nextLine());
        load(fis);
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties prop=new Properties();
        prop.putAll(properties);

//        for (Map.Entry<String, String> entry : properties.entrySet()) {
//            prop.setProperty(entry.getKey(),entry.getValue());
//        }

        prop.store(outputStream,null);

    }

    public void load(InputStream inputStream) throws Exception {
        Properties prop=new Properties();
        prop.load(inputStream);
        properties.putAll((Map) prop);

//        Enumeration<?> e=prop.propertyNames();
//        while (e.hasMoreElements()){
//            String key=(String) e.nextElement();
//            String value=prop.getProperty(key);
//            properties.put(key,value);
//        }
    }

    public static void main(String[] args) throws Exception {
        Solution solution=new Solution();
        solution.fillInPropertiesMap();
        System.out.println(properties);
        FileOutputStream fos=new FileOutputStream("f1");
        solution.save(fos);
        fos.close();



    }
}
