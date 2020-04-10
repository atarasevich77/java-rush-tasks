package com.javarush.task.task04.task0441;

/* 
Как-то средненько
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить среднее из трех чисел.
4. Если все числа равны, вывести любое из них.
5. Если два числа из трех равны, вывести любое из двух.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b && b == c)
        {
            System.out.println(a);
        }
        else {
            if(a == b && a != c)
            {
                System.out.println(a);
            }
            else if(c == b && a != c)
            {
                System.out.println(c);
            }
            else if((a < b && a > c) || (a > b && a < c))
            {
                System.out.println(a);
            }
            else if((a > b && b > c) || (a < b && b < c))
            {
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }
        }
    }
}
