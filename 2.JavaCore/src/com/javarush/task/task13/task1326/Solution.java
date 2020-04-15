package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.

1. Программа должна считывать данные с консоли.
2. Программа должна создавать FileInputStream для введенной с консоли строки.
3. Программа должна выводить данные на экран.
4. Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
5. Программа должна закрывать поток чтения из файла(FileInputStream).
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bf.readLine();
        bf.close();

//        InputStream in = new FileInputStream("C:\\Users\\vika\\Downloads\\test.txt");
        InputStream in = new FileInputStream(fileName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        List<Integer> list = new ArrayList<>();
        while(reader.ready()){
            list.add(Integer.parseInt(reader.readLine()));
        }
        list.stream()
                .filter(v -> v%2 == 0)
                .sorted()
                .forEach(System.out::println);

        reader.close();
        in.close();
    }
}
