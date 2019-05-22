package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

/* 
Проход по дереву файлов
*/
public class Solution {
    static FileComporator fileComporator=new FileComporator();
   static TreeSet<File> set=new TreeSet<>(fileComporator);


    public static void main(String[] args) throws IOException {
        File path=new File(args[0]);
        File result=new File(args[1]);
        System.out.println(result.getParent());
        System.out.println(path.getParent());

        File result1=new File(result.getParent()+"\\allFilesContent.txt");
        if (FileUtils.isExist(result1)) {
            FileUtils.deleteFile(result1);
        }
FileUtils.renameFile(result,result1);
        FileOutputStream fos=new FileOutputStream(result1,true);


folder(path);

//        System.out.println(set);
        for (File file : set) {
            System.out.println(file.getParent());
            FileInputStream fis=new FileInputStream(file);
            while (fis.available()>0){
            fos.write(fis.read());
            }
            fos.write(File.separator.getBytes());
        }
        fos.close();

    }

   static void  folder (File file){
        for (File file1 : file.listFiles()) {
            if (file1.length()<=50&&!file1.isDirectory())set.add(file1);
            if (file1.isDirectory()){
                folder(file1);

            }
        }
    }
}
 class FileComporator implements Comparator<File>{
     @Override
     public int compare(File o1, File o2) {
         return o1.getName().compareTo(o2.getName());
     }
 }