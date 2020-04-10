package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет

Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.

1. Программа не должна считывать текст c клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна выводить квадрат из 10х10 букв S.
4. В программе должен использоваться цикл while.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String s = "S";
        int i = 0;
        while(i < 10){
            int j = 0;
            while (j < 10){
                System.out.print(s);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
