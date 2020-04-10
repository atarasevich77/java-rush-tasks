package com.javarush.task.task04.task0442;

/* 
Суммирование
Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.

1. Программа должна считывать числа c клавиатуры.
2. Если пользователь ввел -1, программа должна вывести сумму всех введенных чисел на экран и завершиться.
3. Программа должна посчитать сумму введенных чисел и вывести её на экран.
4. В программе должен использоваться цикл for, while или do-while.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        while (true) {
            int number = sc.nextInt();
            arr.add(number);
            if (number == -1)
            break;
        }
        int summ = 0;
        for (int x: arr){
            summ += x;
        }
        System.out.println(summ);
    }
}
