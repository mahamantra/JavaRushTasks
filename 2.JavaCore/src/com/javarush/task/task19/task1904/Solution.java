package com.javarush.task.task19.task1904;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException, ParseException {
//        File file=new File("f1");
//        Scanner scanner = new Scanner(file);
//        PersonScannerAdapter psa = new PersonScannerAdapter(scanner);
//        Person person=psa.read();
//        System.out.println(person);
//        Person person1=psa.read();
//        System.out.println(person1);
    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String s="";
            ArrayList<String> strings=new ArrayList<>();
            if(fileScanner.hasNext())
                s=fileScanner.nextLine();
            for (String s1 : s.split(" ")) {
                strings.add(s1);
            }
            Date date = new SimpleDateFormat( "ddMMyyyy" ).parse( strings.get(3)+strings.get(4)+strings.get(5) );
           // Date date=new Date(Integer.parseInt(strings.get(5),Integer.parseInt(strings.get(4),Integer.parseInt(strings.get(3)))));

            return new Person(strings.get(1),strings.get(2),strings.get(0),date);
        }

        @Override
        public void close() throws IOException {
fileScanner.close();
        }
    }
}
