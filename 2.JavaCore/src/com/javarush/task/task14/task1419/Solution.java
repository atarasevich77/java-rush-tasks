package com.javarush.task.task14.task1419;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
Заполни список exceptions десятью(10) различными исключениями.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }
        //напишите тут ваш код
        try {
            int[] arr = new int[2];
            int a = arr[3];
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Solution sol = null;
            sol.toString();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            FileReader fr = new FileReader("dsf");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            String str = "Hello world!";
            char ch = str.charAt(100);
            System.out.println(ch);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int num = Integer.parseInt("asd");
            System.out.println(num);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Class loadedClass = Class.forName("main.java.Utils");
            System.out.println("Class " + loadedClass + " found!");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] arr = new int[-1];
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Number[] arr = new Double[2];
            arr[0] = new Integer(5);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Object obj = new Integer(100);
            System.out.println((String)obj);
        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}
