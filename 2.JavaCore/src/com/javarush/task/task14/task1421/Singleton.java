package com.javarush.task.task14.task1421;

public class Singleton {
  public static Singleton getInstance(){return instance; }
  private static  Singleton instance=new Singleton();

   private Singleton(){}

}
