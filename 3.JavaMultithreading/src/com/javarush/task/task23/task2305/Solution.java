package com.javarush.task.task23.task2305;

/* 
Inner
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution[] solutions=new Solution[2];

        Solution solution1=new Solution();
        InnerClass innerClass1=solution1.new InnerClass();
        InnerClass innerClass2=solution1.new InnerClass();
        solution1.innerClasses[0]=innerClass1;
        solution1.innerClasses[1]=innerClass2;
        solutions[0]=solution1;

        Solution solution2=new Solution();
        InnerClass innerClass11=solution2.new InnerClass();
        InnerClass innerClass22=solution2.new InnerClass();
        solution2.innerClasses[0]=innerClass11;
        solution2.innerClasses[1]=innerClass22;
solutions[1]=solution2;
        return solutions;
    }

    public static void main(String[] args) {
        System.out.println(getTwoSolutions()[0]+" "+getTwoSolutions()[1]);
    }
}
