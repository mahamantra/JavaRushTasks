package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA","Ukraine");
        countries.put("RU","Russia");
        countries.put("CA","Canada");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer,Contact{
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }


        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {

            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName()+", "+data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String s=String.valueOf(data.getPhoneNumber());
            char[] chars1={48,48,48,48,48,48,48,48,48,48};
            char[] chars2=s.toCharArray();
            for (int i = 9; i >=(chars1.length-chars2.length); i--) {
                chars1[i]=chars2[i-(chars1.length-chars2.length)];
            }

            return "+"+data.getCountryPhoneCode()+"("+chars1[0]+chars1[1]+chars1[2]+")"+
                    chars1[3]+chars1[4]+chars1[5]+"-"+chars1[6]+chars1[7]+"-"+chars1[8]+chars1[9];
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
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