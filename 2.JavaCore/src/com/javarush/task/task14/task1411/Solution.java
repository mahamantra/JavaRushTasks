package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        ArrayList<Person> list=new ArrayList<>();


        while (true)
        {
           key= reader.readLine();
           if (key.equals("user"))list.add(new Person.User());
           else if (key.equals("loser"))list.add(new Person.Loser());
           else if (key.equals("coder"))list.add(new Person.Coder());
           else if (key.equals("proger"))list.add(new Person.Proger());
           else break;


           }
        for (Person person1 : list) {
            doWork(person1);
           // System.out.println(person);
        }

             //вызываем doWork


    }

    public static void doWork(Person person) {
        if (person instanceof Person.User)((Person.User) person).live();
        if(person instanceof Person.Loser)((Person.Loser) person).doNothing();
        if(person instanceof Person.Coder)((Person.Coder) person).coding();
        if(person instanceof Person.Proger)((Person.Proger) person).enjoy();
    }
}
