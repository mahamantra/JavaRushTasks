package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        String[] data=args;

        System.out.println(data.length);
        System.out.println("length "+data.length/3);
        switch (args[0]) {

            case "-c": {

                for (int i = 0; 2 < data.length - i; i += 3) {

                        System.out.println("i= " + i);
                        Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(data[3 + i]);

                        if (data[2 + i].equals("м")) allPeople.add(Person.createMale(data[1 + i], date));
                        else allPeople.add(Person.createFemale(data[1 + i], date));

                        System.out.println((allPeople.size() - 1));
                }

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

        }

        for (Person person :allPeople ) {
            System.out.println(person.getName()+person.getSex()+person.getBirthDate());
        }
    }
}
