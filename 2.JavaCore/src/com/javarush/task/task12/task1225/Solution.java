package com.javarush.task.task12.task1225;

/* 
Посетители
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        String s="";
       // System.out.println(o.getClass().getSimpleName());

        switch (o.getClass().getSimpleName()) {
            case "Cat" : s="Кот";break;
            case "Tiger":s="Тигр";break;
            case "Lion":s="Лев";break;
            case"Bull":s="Бык";break;
            case"Cow":s="Корова";break;
            default:s="Животное";
        }

        return s;
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
