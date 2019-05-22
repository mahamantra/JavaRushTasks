package com.javarush.task.task19.task1917;

/* 
Класс FileConsoleWriter должен содержать пять методов write и один метод close:

При записи данных в файл, должен дублировать эти данные на консоль.


Требования:
3. Класс FileConsoleWriter должен содержать метод write(char[] cbuf, int off, int len) throws IOException, в котором данные для записи должны записываться в fileWriter и дублироваться в консоль.
4. Класс FileConsoleWriter должен содержать метод write(int c) throws IOException, в котором данные для записи должны записываться в fileWriter и дублироваться в консоль.
5. Класс FileConsoleWriter должен содержать метод write(String str) throws IOException, в котором данные для записи должны записываться в fileWriter и дублироваться в консоль.
6. Класс FileConsoleWriter должен содержать метод write(String str, int off, int len) throws IOException, в котором данные для записи должны записываться в fileWriter и дублироваться в консоль.
7. Класс FileConsoleWriter должен содержать метод write(char[] cbuf) throws IOException, в котором данные для записи должны записываться в fileWriter и дублироваться в консоль.
8. Класс FileConsoleWriter должен содержать метод close() throws IOException, в котором должен вызываться такой же метод поля fileWriter.
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter {
   private FileWriter fileWriter;

    public void write(char[] cbuf, int off, int len) throws IOException{
        fileWriter.write(cbuf, off, len);
        System.out.println(String.valueOf(cbuf,off,len));
    }

    public void write(char[] cbuf) throws IOException{
        fileWriter.write(cbuf);
        System.out.println(String.valueOf(cbuf));
    }


    public void write(String str) throws IOException{
        fileWriter.write(str);
        System.out.println(str);
    }

    public void write(int c) throws IOException{
        fileWriter.write(c);
        System.out.println(c);
    }

    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str,off,len);
        System.out.println(str.substring(off,len+off));
    }

    public void close() throws IOException{
        fileWriter.close();
    }



    public FileConsoleWriter(String fileName) throws IOException {

        this.fileWriter = new FileWriter(fileName);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException {
        this.fileWriter = new FileWriter(fileName,append);
    }

    public FileConsoleWriter(File file) throws IOException {
        this.fileWriter =new FileWriter(file);
    }

    public FileConsoleWriter(File file,boolean append) throws IOException {
        this.fileWriter = new FileWriter(file,append);
    }

    public FileConsoleWriter(FileDescriptor fd) {
        this.fileWriter = new FileWriter(fd);
    }

    public static void main(String[] args) throws IOException {

FileConsoleWriter fileConsoleWriter=new FileConsoleWriter("f1");
fileConsoleWriter.write(49);
fileConsoleWriter.write("qwqwqwqwwq");
 char[] chars={33,55,65,73,83,99,};
fileConsoleWriter.write(chars);
fileConsoleWriter.write(chars,2,3);
String s="12345678";
fileConsoleWriter.write(s,0,3);
fileConsoleWriter.close();
    }

}
