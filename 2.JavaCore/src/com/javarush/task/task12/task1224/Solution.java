package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String s="";
        if (o instanceof Cat||o instanceof Tiger||o instanceof Lion||o instanceof Bull) {
         if(   o instanceof Cat) s="Кот";
        if (o instanceof Tiger) s="Тигр";
        if (o instanceof Lion) s="Лев";
        if (o instanceof Bull) s="Бык";}

        else s="Животное";

        return s;
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
