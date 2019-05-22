package com.javarush.task.task08.task0814;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
       HashSet<Integer> set=new HashSet<>();

        for (int i = 0; i <20; i++) {set.add(i);

        }
return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        List<Integer> temp=new ArrayList<>();

        for (Integer integer : set) {if (integer>10)temp.add(integer);

        }
        for (Integer integer : temp) {set.remove(integer);

        }

//        for (Integer i:set
//             ) {
//            System.out.println(i);
//
//        }

return set;
    }

    public static void main(String[] args) {removeAllNumbersMoreThan10(createSet());

    }
}
