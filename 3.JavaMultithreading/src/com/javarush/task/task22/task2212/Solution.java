package com.javarush.task.task22.task2212;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Проверка номера телефона
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber==null) return false;
        if(!check1(telNumber))return false;
       if(!check2(telNumber))return false;
        if(!check3(telNumber))return false;
        if(!check4(telNumber))return false;
        if(!check5(telNumber))return false;

        return true;
    }

    public static boolean check1(String telNumber){
        int i=0;

        if (telNumber.matches("^\\+.*")){

            Pattern pattern=Pattern.compile("\\d{1}");
            Matcher matcher=pattern.matcher(telNumber);
            while (matcher.find()){
                i++;
            }
            return i==12;
        }else  if (telNumber.matches("^\\d.*")|telNumber.matches("^\\(.*")){

            Pattern pattern=Pattern.compile("\\d{1}");
            Matcher matcher=pattern.matcher(telNumber);
            while (matcher.find()){
                i++;

            }
            return i==10;
        }

        return false;
    }
    public static boolean check2(String telNumber){
        Pattern pattern=Pattern.compile("-");
        Matcher matcher=pattern.matcher(telNumber);
        int i=0;
        int last=0;

        while (matcher.find()){
            if (last==matcher.start()+1)return false;
            last=matcher.start();
            i++;
        }
        return i>=0&&i<=2;
    }
    public static boolean check3(String telNumber){
       if( telNumber.matches("[A-Za-zА-Яа-я]"))return false;
       return true;
    }
    public static boolean check4(String telNumber){
        Matcher matcher=Pattern.compile("\\d$").matcher(telNumber);

        return matcher.find();

    }
    public static boolean check5(String telNumber){
        Pattern pattern=Pattern.compile("\\(");
        Matcher matcher=pattern.matcher(telNumber);
        int i=0;

        while (matcher.find()){
            i++;
            if (i>1)return false;
        }

        Pattern pattern1=Pattern.compile("\\)");
        Matcher matcher1=pattern1.matcher(telNumber);
        int last=0;

        while (matcher1.find()){
            last++;
            if (last>1)return false;
        }

        if (i>0|last>0) {
            Matcher matcher2 = Pattern.compile("^\\+?\\d*\\(\\d\\d\\d\\)").matcher(telNumber);
            int j = 0;

            while (matcher2.find()) {
                j++;

            }
            return j==1;
        }

               return true;
    }




    public static void main(String[] args) {
//        int i=-20;
//        System.out.format("%"+i+"s %s-%s%n","+380501234567",checkTelNumber("+380501234567"),"true");
//        System.out.format("%-20s %s-%s%n","+38(050)1234567",checkTelNumber("+38(050)1234567"),"true");
//        System.out.format("%-20s %s-%s%n","+38050123-45-67",checkTelNumber("+38050123-45-67"),"true");
//        System.out.format("%-20s %s-%s%n","050123-4567",checkTelNumber("050123-4567"),"true");
//        System.out.format("%-20s %s-%s%n","+38)050(1234567",checkTelNumber("+38)050(1234567"),"false");
//        System.out.format("%-20s %s-%s%n","+38(050)1-23-45-6-7",checkTelNumber("+38(050)1-23-45-6-7"),"false");
//        System.out.format("%"+i+"s %s-%s%n","050ххх4567",checkTelNumber("050ххх4567"),"false");
//        System.out.format("%"+i+"s %s-%s%n","050123456",checkTelNumber("050123456"),"false");
//        System.out.format("%"+i+"s %s-%s%n","(0)501234567",checkTelNumber("(0)501234567"),"false");

        HashMap<String, Boolean> map = new HashMap<>();

        map.put("38xx501A34567", false);
        map.put("3805012345", true);
        map.put("+380501234567", true);
        map.put("++380501234567", false);
        map.put("+38(0501234567", false);
        map.put("+38)050(1234567", false);
        map.put("+38(050)1234567", true);
        map.put("+38(05)1234567", false);
        map.put("(3)80501234567", false);
        map.put("(380)501234567", false);
        map.put("380-50123-45", true);
        map.put("(380)501-234567", false);
        map.put("(38-0)501234567", false);
        map.put("380-(501)234567", false);
        map.put("380(50-1)234567", false);
        map.put("380(501)(23)4567", false);
        map.put("+38050123(456)7", true);
        map.put("+38050123(456)76", false);
        map.put("+380501234(567)", false);
        map.put("3-805-0123-45", false);
        map.put("-3805-012345", false);
        map.put("3805-012345-", false);
        map.put("+380501234567", true);
        map.put("+38(050)1234567", true);
        map.put("+38(05)01234567", false);
        map.put("+38(0501)234567", false);
        map.put("+38050123-45-67", true);
        map.put("050123-4567", true);
        map.put("+38)050(1234567", false);
        map.put("+38(050)1-23-45-6-7", false);
        map.put("050ххх4567", false);
        map.put("050123456", false);
        map.put("+38-(050)1234567", false);
        map.put("+38((050)1234567", false);
        map.put("+5(0--5)1234567", false);
        map.put("7-4-4123689-5", false);
        map.put("1-23456789-0", true);
        map.put("+38051202(345)7", true);
        map.put("+313450--531202", false);
        map.put("", false);
        map.put("(050)34(125)6-7", false);
        map.put("+38)050(1234567", false);
        map.put("+3+8(050)1234567", false);
        map.put("+313450531202-", false);
        map.put("(380)(050)3567", false);
        map.put("050123456", false);
        map.put("+38(050)1-23-45-6-7", false);
        map.put("+38050123-45-67", true);
        map.put("(345)0512027", true);
        map.put("+38050123-45-6789", false);
        map.put("050123-45678", false);
        map.put("+38)050(1234567", false);
        map.put("050123456", false);
        map.put("+38-(050)1234567", false);
        map.put("(380)(050)3567", false);
        map.put("+38((050)1234567", false);
        map.put("+5(0--5)1234567", false);
        map.put("7-4-4123689-5", false);
        map.put("+(012)--123456789", false);
        map.put("7-4-4123689-5", false);
        map.put("-38-(050)34567", false);
        map.put("+38(050)1-23-45-6-7", false);
        map.put("(050)34125)67", false);
        map.put("050123456", false);
        map.put("050123-4567", true);
        map.put("+38((050)1234567", false);
        map.put("-12345678910", false);
        map.put("+38(050)1234567-", false);
        map.put("+38050(123)(456)7", false);
        map.put("050С…С…С…4567", false);
        map.put("0-50123-4567", true);
        map.put("+38(050)12-34-567", true);
        map.put(null, false);
        map.put("", false);
        map.put("+380501234567", true);
        map.put("+3805012345q67", false);
        map.put("+3805012345 67", false);
        map.put("+3805012345.67", false);
        map.put("+3805012345,67", false);
        map.put("1-23456789-0", true);
        map.put("1-23(456)789-0", false);
        map.put("1-234567(89-0)", false);
        map.put("1-2345678(9-0)", false);
        map.put("(1-2)3456789-0", false);
        map.put("(345)0512027", true);
        map.put("+-313450531202-", false);
        map.put("+380501212334567", false);
        map.put("+3805012asd34567", false);
        map.put("+38(050)1234567", true);
        map.put("+38(150)1234567", true);
        map.put("+3+8(050)1234567", false);
        map.put("+38(050)12-34-567", true);
        map.put("+38(050)12-34567", true);
        map.put("+38(050)112-34567", false);
        map.put("+38(050)12-34(5)67", false);
        map.put("+3(8)(050)12-34567", false);
        map.put("+38050123-45-67", true);
        map.put("+38050123-45-6789", false);
        map.put("050123-4567", true);
        map.put("050123-45678", false);
        map.put("+38)050(1234567", false);
        map.put("+38(050)1-23-45-6-7", false);
        map.put("050ххх4567", false);
        map.put("050123456", false);
        map.put("(0)501234567", false);
        map.put("+38-(050)1234567", false);
        map.put("38-(050)34567", false);
        map.put("-38-(050)34567", false);
        map.put("38-(050)34567-", false);
        map.put("38(050)3(45)67", false);
        map.put("(380)(050)3567", false);
        map.put("+38(380)(050)3567", false);
        map.put("8(380)(050)367", false);
        map.put("8(380)4(050)67", false);
        map.put("+38((050)1234567", false);
        map.put("+5(0--5)1234567", false);
        map.put("7-4-4123689-5", false);
        map.put("+(012)1234567", false);
        map.put("+(01-2)123456789", false);
        map.put("+(012)12345678--9", false);
        map.put("+(012)--123456789", false);
        map.put("+38050(123)(456)7", false);
        map.put("+38051202(345)7", true);
        map.put("+380501234(567)", false);
        map.put("+38050123425-1", true);
        map.put("+380501234251", true);


        for (Map.Entry pair : map.entrySet()) {
            boolean result = checkTelNumber(pair.getKey() == null ? null : pair.getKey().toString());
            if (result != (Boolean) pair.getValue())
                System.out.println(pair.getKey().toString() + " (need: " + pair.getValue() + ", have: " + result + ")");
    }
}
}
