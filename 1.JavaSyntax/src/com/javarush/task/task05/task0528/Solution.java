package com.javarush.task.task05.task0528;
import java.util.*;
import java.text.*;

public class Solution {
    public static void main(String[] args) {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd MM yyyy");

        System.out.println(formatForDateNow.format(dateNow));
    }
}
