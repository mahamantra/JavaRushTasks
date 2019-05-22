package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println(new Solution(4));
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("f1"));
        Solution savedObject=new Solution(10);
        oos.writeObject(savedObject);

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("f1"));
        Object object=ois.readObject();
        Solution loadedObject=(Solution) object;

        System.out.println(savedObject.string);
        System.out.println(loadedObject.string);

    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
