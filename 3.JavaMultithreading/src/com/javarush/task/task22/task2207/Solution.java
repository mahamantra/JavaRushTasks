package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        Scanner scanner=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new FileReader(scanner.nextLine()));


        StringBuilder sb=new StringBuilder();

        while (br.ready()){
            sb.append(br.readLine()+" ");
        }

        String s=sb.toString();
String[] strings=s.split(" ");
sb.setLength(0);

        for (int i = 0; i <strings.length-1; i++) {
            if (strings[i].equals(""))continue;
            for (int j = i+1; j <strings.length ; j++) {
                sb.setLength(0);
                sb.append(strings[i]);
                sb=sb.reverse();
                if(sb.toString().equals(strings[j])){
                    result.add(new Pair(strings[i],strings[j]));
                    strings[i]="";
                    strings[j]="";
                    break;
                }

            }

        }

        for (Pair pair : result) {
            System.out.println(pair.toString());
        }

    }

    public static class Pair {
        String first;
        String second;

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }
        public Pair(){}

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
