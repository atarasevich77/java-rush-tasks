package com.javarush.task.task04.task0439;

/* 
Письмо счастья
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: <имя> любит меня.
1. Программа должна считывать имя c клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна выводить 10 раз текст указанный в задании.
4. В программе должен использоваться цикл for.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(name + " любит меня.");
        }
    }
}
