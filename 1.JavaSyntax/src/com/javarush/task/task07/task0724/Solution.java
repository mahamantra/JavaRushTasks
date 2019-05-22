package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
       Human a1= new Human("a",true,12);
        Human a2= new Human("q",false,13);
        Human a3= new Human("w",true,14);
        Human a4= new Human("e",false,15);

        Human a6= new Human("r",true,33,a3,a2);
        Human a7= new Human("s",false,21,a3,a2);
        Human a8= new Human("c",true,66,a3,a2);
        Human a9= new Human("s",false,333,a3,a2);
        Human a11= new Human("at",true,77,a3,a2);


        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println(a4.toString());

        System.out.println(a6.toString());
        System.out.println(a7.toString());
        System.out.println(a8.toString());
        System.out.println(a9.toString());
        System.out.println(a11.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name=name;
            this.sex=sex;
            this.age=age;

        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















