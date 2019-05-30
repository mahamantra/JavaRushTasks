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

//        System.out.println(args.length);
//        System.out.println("length "+args.length/3);

        switch (args[0]) {

            case "-c": {
                synchronized (allPeople){
                    for (int i = 0; 2 < args.length - i; i += 3) {
                        // System.out.println("i= " + i);
                        Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3 + i]);
                        if (args[2 + i].equals("м")) allPeople.add(Person.createMale(args[1 + i], date));
                        else allPeople.add(Person.createFemale(args[1 + i], date));
                        System.out.println((allPeople.size() - 1));
                    }
                }
                break;
            }

            case "-u": {
                synchronized (allPeople) {
                    for (int i = 0; 2 < args.length - i; i += 4) {
                        Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4 + i]);
                        if (args[3 + i].equals("м"))
                            allPeople.set(Integer.parseInt(args[1 + i]), Person.createMale(args[2 + i], date));
                        else allPeople.set(Integer.parseInt(args[1 + i]), Person.createFemale(args[2 + i], date));
                    }
                }break;
            }

            case "-d": {
                synchronized (allPeople) {
                    for (int i = 1; 0 < args.length - i; i++) {

                        allPeople.get(Integer.parseInt(args[i])).setBirthDate(null);
                        allPeople.get(Integer.parseInt(args[i])).setName(null);
                        allPeople.get(Integer.parseInt(args[i])).setSex(null);
                    }
                }break;
            }

            case "-i": {
                synchronized (allPeople) {
                    SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

                    for (int i = 1; 0 < args.length - i; i++) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        System.out.println(String.format("%s %s %s", person.getName(), (person.getSex().toString() == "MALE" ? "м" : "ж"), DateFormat.format(person.getBirthDate())));
                    }
                }break;
            }
        }



//        for (Person person :allPeople ) {
//            System.out.println(person.getName()+person.getSex()+person.getBirthDate());
//        }
    }
}
