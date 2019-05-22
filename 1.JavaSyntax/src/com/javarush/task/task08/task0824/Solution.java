package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {


                Human children1=new Human();
        children1.name="chld1";
        children1.age=10;
        System.out.println(children1);

        Human children2=new Human();
        children2.name="chld2";
        children2.age=20;
        System.out.println(children2);

        Human children3=new Human();
        children3.name="chld3";
        children3.age=20;
        System.out.println(children3);

        Human father =new Human();
        father.name="father";
        father.sex=true;
        father.age=45;
        father.children.add(children1);
        father.children.add(children2);
        father.children.add(children3);
        System.out.println(father);

        Human mather =new Human();
        mather.name="mather";
       // father.sex=true;
        mather.age=45;
        mather.children.add(children1);
        mather.children.add(children2);
        mather.children.add(children3);
        System.out.println(mather);

        Human grandFather1=new Human();
        grandFather1.name="grandFather1";
        grandFather1.sex=true;
        grandFather1.age=75;
        grandFather1.children.add(father);
        System.out.println(grandFather1);

        Human grandFather2=new Human();
        grandFather2.name="grandFather2";
        grandFather2.sex=true;
        grandFather2.age=75;
        grandFather2.children.add(mather);
        System.out.println(grandFather2);

        Human grandMather1=new Human();
        grandMather1.name="grandMather1";
        grandMather1.age=75;
        grandMather1.children.add(father);
        System.out.println(grandMather1);

        Human grandMather2=new Human();
        grandMather2.name="grandMather1";
        grandMather2.age=75;
        grandMather2.children.add(mather);
        System.out.println(grandMather2);





    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children=new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
