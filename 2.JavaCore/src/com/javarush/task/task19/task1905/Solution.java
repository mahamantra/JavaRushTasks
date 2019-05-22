package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();

    static {
        countries.put("UA","Ukraine");
        countries.put("RU","Russia");
        countries.put("CA","Canada");
    }
    public static void main(String[] args) {
//        DataAdapter dataAdapter=new DataAdapter(new Customer() {
//            @Override
//            public String getCompanyName() {
//                return "JavaRush Ltd.";
//            }
//
//            @Override
//            public String getCountryName() {
//                return "Ukraine";
//            }
//        }, new Contact() {
//            @Override
//            public String getName() {
//                return "Ivanov, Ivan";
//            }
//
//            @Override
//            public String getPhoneNumber() {
//                return "+38(050)123-45-67";
//            }
//        });
//
//        System.out.println(dataAdapter.getCompany());
//        System.out.println(dataAdapter.getContactFirstName());
//        System.out.println(dataAdapter.getContactLastName());
//        System.out.println(dataAdapter.getCountryCode());
//        System.out.println(dataAdapter.getDialString());

    }

    public static class DataAdapter implements RowItem{
        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer=customer;
            this.contact=contact;
        }

        @Override
        public String getCountryCode() {
            String s="";
            for (Map.Entry<String, String> entry : countries.entrySet()) {
                if (customer.getCountryName().equals(entry.getValue()))s= entry.getKey();
            }
            return s;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String s=contact.getName();
            String[] strings=new String[2];
            strings=s.split(", ");

            return strings[1];
        }

        @Override
        public String getContactLastName() {
            String s=contact.getName();
            String[] strings=new String[2];
            strings=s.split(", ");
            return strings[0];
        }

        @Override
        public String getDialString() {
           String s= contact.getPhoneNumber();
            Pattern pattern=Pattern.compile("\\d+");
            Matcher matcher=pattern.matcher(s);
            StringBuilder stringBuilder=new StringBuilder();
            while (matcher.find())stringBuilder.append(matcher.group());
            return "callto://+"+stringBuilder.toString();
        }
    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }
}