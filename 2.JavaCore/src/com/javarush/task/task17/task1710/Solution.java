package com.javarush.task.task17.task1710;

import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
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

    public static void main(String[] args) throws ParseException {
       // Scanner scan = new Scanner(System.in);
      //  String s=scan.nextLine();
        String s="-c Миронов м 15/04/1990";
       // System.out.println(s);

        String[] data=s.split(" ");

        for (int i=data.length-1; i >=0; i--) {
           // System.out.println("String["+i+"]= "+data[i]);
        }

        if (data[0].equals("-c")){
           // System.out.println(data[0]);
            Date date = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH).parse(data[3]);

            if (data[2].equals("м")) System.out.println(allPeople.add(Person.createMale(data[1],date)));
                else  allPeople.add(Person.createFemale(data[1],date));

            System.out.println("id= "+(allPeople.size()-1));
        }

        for (Person a:allPeople
             ) {
            System.out.print(a.getSex()+" "+a.getName()+" ");
            SimpleDateFormat DateFormat=new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            String date=DateFormat.format(a.getBirthDate());
            System.out.println(date);
        }

    }
}
