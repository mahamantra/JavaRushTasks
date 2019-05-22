package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
       private String name;
       private int age;
       private boolean sex;
       private int weight;
       private int heigt;
       private String address;

        public Human(String name) {
            this.name = name;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(boolean sex, int heigt, String address) {
            this.sex = sex;
            this.heigt = heigt;
            this.address = address;
        }

        public Human(String name, int age, boolean sex, int weight, int heigt, String address) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.heigt = heigt;
            this.address = address;
        }

        public Human(String name, boolean sex, int heigt) {
            this.name = name;
            this.sex = sex;
            this.heigt = heigt;
        }

        public Human(String name, int age, boolean sex, int weight, int heigt) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.heigt = heigt;
        }

        public Human(int weight, int heigt, String address) {
            this.weight = weight;
            this.heigt = heigt;
            this.address = address;
        }

        public Human(String name, int age, int heigt, String address) {
            this.name = name;
            this.age = age;
            this.heigt = heigt;
            this.address = address;
        }

        public Human(boolean sex) {
            this.sex = sex;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }
    }

}
