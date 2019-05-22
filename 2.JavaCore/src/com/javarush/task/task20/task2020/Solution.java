package com.javarush.task.task20.task2020;

import java.io.*;
import java.util.logging.Logger;

/* 
Сериализация человека
*/
public class Solution {

    public static class Person implements Serializable{
        String firstName;
        String lastName;
      transient   String fullName;
       transient   final String greetingString;
        String country;
        Sex sex;
       transient PrintStream outputStream;
       transient Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greetingString = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }



    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream stream=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(stream);

        Person person=new Person("ivan","sidorov","russia",Sex.MALE);
        oos.writeObject(person);

        ByteArrayInputStream stream1=new ByteArrayInputStream(stream.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(stream1);

        Person person1=(Person) ois.readObject();
        System.out.println(person1.equals(person));

        System.out.println(person1.firstName);
        System.out.println(person1.lastName);
        System.out.println(person1.fullName);
        System.out.println(person1.greetingString);
        System.out.println(person1.country);
        System.out.println(person1.sex);

    }
}
