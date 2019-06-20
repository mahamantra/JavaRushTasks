package com.javarush.task.task25.task2512;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Живем своим умом
*/
public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {

        t.interrupt();
        recursion(e);
        /*Throwable th = e;
        List<Throwable> list=new ArrayList<>();

        while (th != null) {
            list.add(th);
            th = th.getCause();
        }

        Collections.reverse(list);
        for (Throwable tt:list
             ) {
            System.out.println(tt);
        }*/


    }

    public void recursion(Throwable t){
        if (t.getCause()!=null)
            recursion(t.getCause());
        System.out.println(t);
    }


    public static void main(String[] args) {
        new Solution().uncaughtException(Thread.currentThread(), new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI"))));
    }
}
