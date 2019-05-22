package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list=new ArrayList<>();
        int[] a ={5,5,5,5,5};
        int[] d ={2,2};
                int[] b ={4,4,4,4};
        int[] c ={7,7,7,7,7,7,7};

        list.add(a);
        list.add(d);
        list.add(b);
        list.add(c);
        list.add(new int[]{2,1,3,1,3});

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
