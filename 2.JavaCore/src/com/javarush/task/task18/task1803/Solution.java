package com.javarush.task.task18.task1803;

/* 
Самые частые байты
Ввести с консоли имя файла.
Найти байт или байты с максимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.

1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль через пробел должны выводиться все байты из файла с максимальным количеством повторов.
4. Данные в консоль должны выводится в одну строку.
5. Поток чтения из файла должен быть закрыт.
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
//        String fileName = "C:\\Users\\vika\\Downloads\\test2.txt";


        FileInputStream inputStream = new FileInputStream(fileName);
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        while(inputStream.available() > 0){
            list.add(inputStream.read());
        }
        inputStream.close();
        reader.close();

        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), Collections.frequency(list, list.get(i)));
        }

        int x = Collections.max(map.values());
        map.forEach((k, v) -> {
            if (v.equals(x))
                System.out.print(k + " ");
            }
        );
    }
}
