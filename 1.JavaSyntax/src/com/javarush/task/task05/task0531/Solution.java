package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Совершенствуем функциональность
Текущая реализация: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.

1. Программа должна считывать числа с клавиатуры.
2. В классе должен быть метод public static void main.
3. В классе должен быть метод public static min, принимающий 5 параметров типа int.
4. Метод min должен возвращать минимум из 5 переданных чисел. Если минимальных чисел несколько - вернуть любое из них.
5. Программа должна выводить строку, которая начинается на "Minimum = ".
6. Программа должна выводить строку, которая заканчивается минимальным из 5 введенных чисел.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        int minimum = min(list);
        System.out.println("Minimum = " + minimum);
    }

    public static int min(int a, int b, int c, int d, int e){
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        Collections.sort(list);
        return list.get(0);
    }
    public static int min(List<Integer> list) {
        Collections.sort(list);
        return list.get(0);
    }
}
