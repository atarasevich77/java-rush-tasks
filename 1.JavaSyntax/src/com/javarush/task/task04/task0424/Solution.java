package com.javarush.task.task04.task0424;

/* 
Три числа
Ввести с клавиатуры три целых числа.
Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.

1. Программа должна считывать числа c клавиатуры.
2. Программа должна использовать команды System.out.println() или System.out.print().
3. Программа должна выводить на экран порядковый номер числа, отличного от остальных.
4. Если все числа разные, ничего не выводить.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b || a == c || b == c)
        {
            if(a == b){
                System.out.println(3);
            } else if(a == c){
                System.out.println(2);
            } else if(b == c){
                System.out.println(1);
            }
        }
    }
}
