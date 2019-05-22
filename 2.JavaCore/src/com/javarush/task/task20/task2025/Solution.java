package com.javarush.task.task20.task2025;

import java.util.ArrayList;

/*
Алгоритмы-числа
*/
public class Solution {
    public static long[] getNumbers(long N) {
        long[] result = null;
        ArrayList<Long> list=new ArrayList<>();

        for (long j=1;j<=N;j++) {
            int m=0;
            ArrayList<Long> arrayList=new ArrayList<>();
            long i=j;

            while (i>0){
                arrayList.add(i%10);
                i= i/ 10;
                m++;
            }
            double s=0d;
            for (long aLong : arrayList) {
                s=s+ Math.pow(aLong,m);
            }
            if (s==j) list.add(j);
        }
        result=new long[list.size()];
int i=0;
        for (Long aLong : list) {
result[i]=aLong;
i++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.currentTimeMillis();
       long[] a= Solution.getNumbers(10000);
        for (long l : a) {
            System.out.println(l);
        }
    }

}
