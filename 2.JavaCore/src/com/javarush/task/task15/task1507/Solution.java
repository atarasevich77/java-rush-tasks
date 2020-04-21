package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.

1. В классе Solution должны быть реализованы 10 методов printMatrix с различными аргументами.
2. Класс Solution должен быть public.
3. Все методы класса Solution должны быть статическими.
4. Все методы класса Solution должны быть публичными.
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");

        printMatrix(2);
        printMatrix(2, 3.00);
        printMatrix("8");
        printMatrix("8", "8");
        printMatrix("8", 3, "8");
        printMatrix("d");
        printMatrix("d", "8");
        printMatrix(true);

    }

    public static void printMatrix(int m) {
        System.out.println(m);
    }
    public static void printMatrix(int m, double n) {
        System.out.println(m+" "+n);
    }
    public static void printMatrix(String value) {
        System.out.println(value);
    }
    public static void printMatrix(String value, String value2) {
        System.out.println(value+" "+value2);
    }
    public static void printMatrix(String value, double n, String value2) {
        System.out.println(value+" "+n+" "+value2);
    }
    public static void printMatrix(char value) {
        System.out.println(value);
    }
    public static void printMatrix(char value, char value2) {
        System.out.println(value+" "+value2);
    }
    public static void printMatrix(boolean value) {
        System.out.println(value);
    }



    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
