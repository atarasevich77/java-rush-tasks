package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Cамая длинная последовательность
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.

Программа должна выводить число на экран.
Программа должна считывать значения с клавиатуры.
В методе main объяви переменную типа List с типом элементов Integer и сразу проинициализируй ee.
Программа должна добавлять в коллекцию 10 чисел, согласно условию.
Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int count = 1;
        for (int i = 1; i < list.size(); i++)
        {
            if(list.get(i).equals(list.get(i - 1))
                &&
                list.get(i).equals(list.get(i-count))
            ){
                count++;
            }
        }
        System.out.println(count);
    }
}