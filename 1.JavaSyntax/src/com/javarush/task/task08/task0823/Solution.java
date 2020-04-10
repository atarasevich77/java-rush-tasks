package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

1. Программа должна выводить текст на экран.
2. Программа должна считывать строку с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна заменять в тексте первые буквы всех слов на заглавные.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        //напишите тут ваш код
        String string2 = string.substring(0, 1).toUpperCase();
        for (int i = 1; i < string.length(); i++) {
            //System.out.println(string.substring(i, i + 1));
            if(" ".equals(string.substring(i - 1, i))) {
                string2 = string2 + string.substring(i, i + 1).toUpperCase();
            }
            else{
                string2 = string2 + string.substring(i, i + 1);
            }
        }
        System.out.println(string2);
    }
}
