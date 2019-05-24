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




        String[] data=args;

         if (data[0].equals("-c")){

            Date date = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH).parse(data[3]);

            if (data[2].equals("м")) allPeople.add(Person.createMale(data[1],date));
                else  allPeople.add(Person.createFemale(data[1],date));

            System.out.println((allPeople.size()-1));
          }

        if (data[0].equals("-u")){


            Date date = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH).parse(data[4]);

            if (data[3].equals("м")) allPeople.set(Integer.parseInt(data[1]),Person.createMale(data[2],date));
            else  allPeople.set(Integer.parseInt(data[1]),Person.createFemale(data[1],date));

        }

        if (data[0].equals("-d")){allPeople.get(Integer.parseInt(data[1])).setBirthDate(null);
            allPeople.get(Integer.parseInt(data[1])).setName(null);
            allPeople.get(Integer.parseInt(data[1])).setSex(null);
        }

        if (data[0].equals("-i")) {
            SimpleDateFormat DateFormat=new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            Person person=allPeople.get(Integer.parseInt(data[1]));
            System.out.println(String.format("%s %s %s",person.getName(),(person.getSex().toString()=="MALE"?"м":"ж"),DateFormat.format(person.getBirthDate())));

        }




//        for (Person a:allPeople
//             ) {
//            System.out.print(a.getSex()+" "+a.getName()+" ");
//            SimpleDateFormat DateFormat=new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
//            String date=DateFormat.format(a.getBirthDate());
//            System.out.println(date);
//        }

    }
}
