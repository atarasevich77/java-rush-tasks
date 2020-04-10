package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
Не изменяй заголовок метода createSet().
Программа не должна выводить текст на экран.
Программа не должна считывать значения с клавиатуры.
Метод createSet() должен создавать и возвращать множество (реализация HashSet).
Множество из метода createSet() должно содержать 20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        Set<String> set = new HashSet<>();
        set.add("Лq");set.add("Лw");set.add("Лe");set.add("Лr");set.add("Лt");set.add("Лy");set.add("Лu");set.add("Лi");set.add("Лo");set.add("Лp");
        set.add("Лz");set.add("Лa");set.add("Лs");set.add("Лd");set.add("Лf");set.add("Лg");set.add("Лh");set.add("Лj");set.add("Лk");set.add("Лl");



        return set;
    }

    public static void main(String[] args) {

    }
}
