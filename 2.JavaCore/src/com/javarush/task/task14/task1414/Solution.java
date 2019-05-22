package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        String s=null;
        while (true){
            s=scanner.nextLine();
            if(s.equals("soapOpera"))list.add(s);
            else if (s.equals("cartoon"))list.add(s);
            else if (s.equals("thriller"))list.add(s);
            else {list.add(s);break;}
        }
        Movie movie;
        for (String s1 : list) {
           movie= MovieFactory.getMovie(s1);
           if (movie!=null) System.out.println( movie.getClass().getSimpleName());
        }


        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            if("cartoon".equals(key)){
                movie=new Cartoon();
            }
            if("thriller".equals(key)){
                movie=new Thriller();
            }

            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie{

    }

    static class Thriller extends Movie{}
}
