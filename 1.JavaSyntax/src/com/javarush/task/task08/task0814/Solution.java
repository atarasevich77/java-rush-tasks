package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
Программа не должна выводить текст на экран.
Программа не должна считывать значения с клавиатуры.
Класс Solution должен содержать только три метода.
Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<>();

        set.add(1);set.add(2);set.add(3);set.add(4);set.add(5);set.add(6);set.add(7);set.add(8);set.add(9);set.add(10);
        set.add(11);set.add(12);set.add(13);set.add(14);set.add(15);set.add(16);set.add(17);set.add(18);set.add(19);set.add(20);

        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        set.removeIf(num-> num > 10);
        return set;
    }

    public static void main(String[] args) {
    }
}
