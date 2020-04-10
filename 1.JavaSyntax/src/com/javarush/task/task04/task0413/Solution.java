package com.javarush.task.task04.task0413;

/* 
День недели

Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".

1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если введено число от 1 до 7, необходимо вывести день недели.
4. Если введено число не входящее в интервал от 1 до 7, то вывести уведомление что такого дня недели не существует.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Map<Integer, String> daysOfWeek = new HashMap<>();
        daysOfWeek.put(1, "понедельник");
        daysOfWeek.put(2, "вторник");
        daysOfWeek.put(3, "среда");
        daysOfWeek.put(4, "четверг");
        daysOfWeek.put(5, "пятница");
        daysOfWeek.put(6, "суббота");
        daysOfWeek.put(7, "воскресенье");

        if(a < 1 || a > 7){
            System.out.println("такого дня недели не существует");
        } else {
            System.out.println(daysOfWeek.get(a));
        }
    }
}