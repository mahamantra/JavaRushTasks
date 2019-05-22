package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* 
Требования:
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна заполнить список PEOPLE данными из файла.
6. Программа должна правильно работать с двойными именами, например Анна-Надежда.
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader(args[0]));
        String[] strings=new String[10];

        while (br.ready()){
            ArrayList<Integer> integ=new ArrayList<>();
            String s="";

            strings=br.readLine().split(" ");

            for (String string : strings) {
                try {
                    integ.add(Integer.parseInt(string));
                } catch (NumberFormatException e) {
                    s=s+string+" ";
                }


            }
           // System.out.println(integ);
           // System.out.println(s);
            s=s.trim();
            Date date=new Date(integ.get(2)-1900,integ.get(1)-1,integ.get(0));
            Person person=new Person(s,date);
            PEOPLE.add(person);
        }
        br.close();


        for (Person person : PEOPLE) {
            System.out.println(person.getName());
            System.out.println(person.getBirthday());

        }

    }
}
