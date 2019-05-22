package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    transient private FileOutputStream stream;
    String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName=fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.stream = new FileOutputStream(fileName,true);

    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Solution solution=new Solution("f1");
        solution.writeObject("string");

        FileOutputStream fos=new FileOutputStream("f2");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        oos.writeObject(solution);

        FileInputStream fis=new FileInputStream("f2");
        ObjectInputStream ois=new ObjectInputStream(fis);

        Solution loadSolution=new Solution("f1");
        loadSolution=(Solution) ois.readObject();
        loadSolution.writeObject("string2");


    }
}
