package com.javarush.task.task14.task1410;

/* 
Дегустация вин
*/

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

     static Drink getDeliciousDrink() {
        return new Wine();
    }

     static Wine getWine() {
        return new Wine();

    }

     static Wine getBubblyWine() {
        return new BubblyWine();

    }

}