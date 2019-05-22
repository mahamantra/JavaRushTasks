package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a= 0;
        int b= 0;




            a = Integer.parseInt(reader.readLine());
            b =Integer.parseInt(reader.readLine());
        if (a<=0 || b<=0) throw new Exception();

//        while (a-b!=0){
//            if (a>b)a=a-b;
//            if (b>a)b=b-a;
//
//        }


        ArrayList<Integer> aNOD=new ArrayList<>();
        ArrayList<Integer> bNOD=new ArrayList<>();

        aNOD=Solution.oD(aNOD,a);
        bNOD=Solution.oD(bNOD,b);

        a=Solution.nod(aNOD,bNOD);

//        System.out.println(aNOD);
//        System.out.println(bNOD);
        System.out.println(a);




    }

    static ArrayList<Integer> oD(ArrayList<Integer> aNOD,int a){
        for (int i = 2; i <=a ; i++) {
            if (a%i==0) {aNOD.add(i);
                if (a==i)break;
                else a=a/i;i=1;}

        }
        return aNOD;
    }

    static int nod(ArrayList<Integer> a,ArrayList<Integer> b){
        ArrayList<Integer> c=new ArrayList<Integer>();

        for (int i = 0; i <a.size() ; i++) {
            for (int j = 0; j <b.size() ; j++) {
                if(a.get(i)==b.get(j)){
                    c.add(a.get(i));
                    a.remove(i);
                    b.remove(j);
                    if (a.size()==0||a.size()==0)break;
                }

            }
        }
        int nod=1;
        for (Integer integer : c) {
            nod*=integer;
        }
        return nod;
    }
}