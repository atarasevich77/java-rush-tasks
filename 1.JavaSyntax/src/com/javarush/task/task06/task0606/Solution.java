package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки
1. Программа должна считывать данные с клавиатуры.
2. Метод main должен посчитать сколько четных цифр во веденном числе и записать это количество в переменную even.
3. Метод main должен посчитать сколько нечетных цифр во веденном числе и записать это количество в переменную odd.
4. Программа должна выводить текст на экран.
5. Выведенный текст должен соответствовать заданию.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] numbers = reader.readLine().toCharArray();
        for (int i = 0; i < numbers.length; i++) {
            int number = (int)numbers[i];
            if(number%2 == 0){
                ++even;
            }else{
                ++odd;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
