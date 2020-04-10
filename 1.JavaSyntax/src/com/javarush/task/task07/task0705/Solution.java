package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

1. Программа должна создавать большой массив на 20 целых чисел.
2. Программа должна считывать с клавиатуры 20 чисел для большого массива.
3. Программа должна создавать два маленьких массива на 10 чисел каждый.
4. Программа должна скопировать одну половину большого массива в первый маленький,
а вторую - во второй и вывести второй маленький массив на экран.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] aTwenty = new int[20];
        int[] aFirst = new int[10];
        int[] aSecond = new int[10];

        for (int i = 0; i < aTwenty.length; i++) {
            aTwenty[i] = Integer.parseInt(reader.readLine());
        }
        System.arraycopy(aTwenty, 0, aFirst, 0, aFirst.length);
        System.arraycopy(aTwenty, aFirst.length, aSecond, 0, aSecond.length);
        for (int i = 0; i < aSecond.length; i++) {
            System.out.println(aSecond[i]);
        }
    }
}
