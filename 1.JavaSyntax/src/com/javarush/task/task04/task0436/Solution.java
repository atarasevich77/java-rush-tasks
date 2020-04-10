package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
1. Программа должна считывать два числа c клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна выводить прямоугольник размером m на n из восьмёрок.
4. В программе должен использоваться цикл for.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int height = Integer.parseInt(reader.readLine());
        int width = Integer.parseInt(reader.readLine());

        for(int i = 0; i < height; i++){
            for (int j = 0; j < width; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
