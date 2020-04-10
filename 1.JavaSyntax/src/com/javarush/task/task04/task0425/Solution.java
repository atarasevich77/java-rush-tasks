package com.javarush.task.task04.task0425;

/* 
Цель установлена!

Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.

1. Программа должна считывать числа c клавиатуры.
2. Программа должна использовать команду System.out.println() или System.out.print().
3. Если точка находится в первой координатной четверти, вывести "1".
4. Если точка находится во второй координатной четверти, вывести "2".
5. Если точка находится в третей координатной четверти, вывести "3".
6. Если точка находится в четвёртой координатной четверти, вывести "4".
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = 0;
        if(a>0 && b>0){
            result = 1;
        } else if (a<0 && b>0){
            result = 2;
        } else if (a<0 && b<0){
            result = 3;
        } else if (a>0 && b<0){
            result = 4;
        }
        System.out.println(result);

    }
}
