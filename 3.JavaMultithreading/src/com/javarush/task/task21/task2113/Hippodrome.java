package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public List<Horse> getHorses(){
        return horses;
        }

    public Hippodrome(List<Horse> horses){
        this.horses=horses;
        }

    public void move(){
        for (Horse hors : horses) {
            hors.move();
        }
    }
    public void print(){
        for (Horse hors : horses) {
            hors.print();
        }
        for (int i = 0; i <10 ; i++) {
            System.out.println();
        }
    }

    public void run() throws InterruptedException {
        for (int i = 1; i <=100 ; i++) {
            move();
            print();
            Thread.sleep(200);

        }
    }

    public Horse getWinner(){
        double maxD=0;
        Horse result=null;
        for (Horse hors : horses) {
            if (maxD<hors.distance){maxD=hors.distance;result=hors;}
        }
        return result;
    }
    public void printWinner(){
        System.out.println("Winner is "+getWinner().name+"!");
    }




    public static void main(String[] args) throws InterruptedException {

        Horse horse1=new Horse("1",3,0);
        Horse horse2=new Horse("2",3,0);
        Horse horse3=new Horse("3",3,0);

        List<Horse> horses=new ArrayList<>();
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        game=new Hippodrome(horses);

        game.run();
        game.printWinner();

        }
}

