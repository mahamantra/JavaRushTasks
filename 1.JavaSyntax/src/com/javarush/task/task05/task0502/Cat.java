package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        byte a=0;
        boolean s=false;
        a+=(this.age>anotherCat.age)?1:0;
        a+=(this.weight>anotherCat.weight)?1:0;
        a+=(this.strength>anotherCat.strength)?1:0;

                if (a>=1)s=true;
return s;
    }

    public static void main(String[] args) {

    }
}
