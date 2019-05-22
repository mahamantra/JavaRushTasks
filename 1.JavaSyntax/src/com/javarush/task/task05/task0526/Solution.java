package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1=new Man("sasa",5,"g");
        Man man2=new Man("erre",4,"ee");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);

        Woman Woman1=new Woman("sasa",5,"g");
        Woman Woman2=new Woman("erre",3,"ee");

        System.out.println(Woman1.name + " " + Woman1.age + " " + Woman1.address);
        System.out.println(Woman2.name + " " + Woman2.age + " " + Woman2.address);

    }

    public static class Man{
        String name,address;
        int age;

        public Man(String name,int age,String address){
            this.name=name;
            this.address=address;
            this.age=age;
        }
    }
    public static class Woman{
        String name,address;
        int age;

        public Woman(String name,int age,String address){
            this.name=name;
            this.address=address;
            this.age=age;
        }
    }

}
