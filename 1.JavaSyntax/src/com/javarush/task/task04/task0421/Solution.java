package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
1. Программа должна считывать две строки c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если имена одинаковые вывести сообщение "Имена идентичны"
4. Если имена разные, но их длины равны , вывести сообщение "Длины имен равны"
5. Если имена и длины имен разные - ничего не выводить.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        if(name1.equals(name2)){
            System.out.println("Имена идентичны");
        } else if(name1.length() == name2.length()){
            System.out.println("Длины имен равны");
        }
    }
}
