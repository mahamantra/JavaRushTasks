package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandfather=new Cat(grandfatherName);

        String grandmotherName = reader.readLine();
        Cat catGrandmother=new Cat(grandmotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,catGrandfather,null);

        String motherName = reader.readLine();//имя матери
        Cat catMother = new Cat(motherName,null,catGrandmother);

        String sonName = reader.readLine();//имя дочери
        Cat catSon = new Cat(sonName, catFather,catMother);

        String daughterName = reader.readLine();//имя дочери
        Cat catDaughter = new Cat(daughterName, catFather,catMother);


        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent1;
        private Cat parent2;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent1,Cat parent2) {
            this.name = name;
            this.parent1 = parent1;
            this.parent2 = parent2;
        }

        @Override
        public String toString() {
            if (parent1 == null & parent2==null)
                return "Cat name is " + name + ", no mother, no father ";
            else if (parent2==null) return "Cat name is " + name + ", no mother , father is "+ parent1.name;
                    else if (parent1==null)return "Cat name is " + name + ", mother is " + parent2.name + ", no father ";
            else return "Cat name is " + name + ", mother is " + parent2.name + ", father is "+ parent1.name;
        }
    }

}
