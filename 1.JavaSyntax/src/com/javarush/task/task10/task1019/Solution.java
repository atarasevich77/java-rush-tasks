package com.javarush.task.task10.task1019;

/* 
Функциональности маловато!
Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка - конец ввода данных. Числа могут повторяться.
Строки всегда уникальны. Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран. Каждую пару с новой строки.

1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить текст на экран.
3. В методе main объяви переменную коллекции HashMap и сразу проинициализируй ee.
4. Программа должна помещать в HashMap пары считанные с клавиатуры.
5. Программа должна выводить на экран содержимое HashMap согласно условию.
Ключ и значение разделены пробелом. Каждое значение с новой строки.
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        while(true)
        {
            String strId = reader.readLine();
            if(strId.equals(""))
                break;
            Integer id = Integer.parseInt(strId);
            String name = reader.readLine();
            map.put(name, id);
        }
        map.forEach(
                (k, v) -> System.out.println(v + " " + k)
        );


//        System.out.println("Id=" + id + " Name=" + name);
    }
}
