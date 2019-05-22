package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               // System.out.println();
            }}
            System.out.println(2);
            printMatrix("s", 1,1);

    } public static void printMatrix( Object value, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               // System.out.println();
            }}
            System.out.println(3);printMatrix("w","wq",32);

    } public static void printMatrix(String m,Object value, int n ) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < n; j++) {
               // System.out.println();
            }}
            System.out.println(4);printMatrix("w","e","e");

    }

    public static void printMatrix(String m, String n, String value) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               // System.out.print(value);
            }}
            System.out.println(5);printMatrix("qw","w","d","asas");

    }
    public static void printMatrix(String m, String n, String value,String d) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               // System.out.print(value);
            }}
            System.out.println(6);printMatrix("sd","ddd","dd","dd","");

    }

    public static void printMatrix(String m, String n, String value,String d,String q) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               // System.out.print(value);
            }}
            System.out.println(7);printMatrix("we","we","we","we",6);

    }
    public static void printMatrix(String m, String n, String value,String d,int q) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               // System.out.print(value);
            }}
            System.out.println(8);printMatrix("wer","re","er",4,4);

    }
    public static void printMatrix(String m, String n, String value,int d,int q) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               // System.out.print(value);
            }}
            System.out.println(9);printMatrix("q","w","ww",2);

    }
    public static void printMatrix(String m, String n, String value,int q) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               // System.out.print(value);
            }}
            System.out.println(10);

    }
}
