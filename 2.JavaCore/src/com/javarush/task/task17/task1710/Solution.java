package com.javarush.task.task17.task1710;

import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        System.out.println(s);

        String[] data=s.split(" ");

        for (int i=data.length-1; i >=0; i--) {
            System.out.println("String["+i+"]= "+data[i]);
        }

        if (data[0].equals("-c")){
            System.out.println(data[0]);
            SimpleDateFormat DateFormat=new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            String date=DateFormat.format(data[3]);

            allPeople.add(Person.createFemale(data[1],new Date(date)));
        }

        for (Person a:allPeople
             ) {
            System.out.println(a.getSex()+a.getBirthDate().toString()+a.getName());
            SimpleDateFormat DateFormat=new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            String date=DateFormat.format(a.getBirthDate());
            System.out.println(date);
        }

    }
}
