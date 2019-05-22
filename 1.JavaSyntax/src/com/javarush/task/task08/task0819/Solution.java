package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Iterator iterator=cats.iterator();
       // iterator.hasNext();
        iterator.next();
        iterator.remove();

        printCats(cats);
    }

    public static class Cat{
        public Cat(){

        }

    }


    public static Set<Cat> createCats() {
        Set<Cat> catSet= new HashSet<>();
        catSet.add(new Cat());
        catSet.add(new Cat());
        catSet.add(new Cat());
        return catSet;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);

        }
    }

    // step 1 - пункт 1
}
