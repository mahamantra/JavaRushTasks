package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы Run, Swim
*/

public class Solution {
    public static void main(String[] args) {

    }

    interface Run{
        void a();
    }

    interface Swim{
        void a();
    }

    abstract public class Human implements Run,Swim{

    }



    //add public interfaces and public class here - добавь public интерфейсы и public класс тут
}
