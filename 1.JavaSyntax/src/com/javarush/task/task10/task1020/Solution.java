package com.javarush.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
Задача: ввести с клавиатуры 30 чисел. Вывести 10-е и 11-е минимальные числа.
Пояснение:
Самое минимальное число - 1-е минимальное.
Следующее минимальное после него - 2-е минимальное

1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить текст на экран.
3. Класс Solution должен содержать два метода.
4. Метод sort() должен сортировать массив элементов.
5. Метод main() должен вызывать метод sort().
6. Программа должна выводить 10-е и 11-е минимальные числа. Каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        /*int[] array = {
                5,
                10,
                16,
                17,
                9,
                3,
                4,
                46,
                97,
                12,
                45,
                42,
                98,
                98,
                71,
                        -123,
                        -85,
                        -16,
                        -17,
                        -9,
                        -3,
                        -4,
                        -46,
                        -97,
                        -12,
                        -45,
                        -42,
                918,
                        -98,
                        -71
        };*/
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        for (int i = 0; i < array.length; i++)
        {
            int tmp;
            for (int j = i + 1; j < array.length; j++)
            {
                if(array[i] > array[j])
                {
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + ", ");
//        }
//        System.out.println("\n-----------------");
    }
}
