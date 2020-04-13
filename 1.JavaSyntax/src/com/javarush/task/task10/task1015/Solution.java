package com.javarush.task.task10.task1015;

import java.util.*;

/* 
Массив списков строк
Создать массив, элементами которого будут списки строк.
Заполнить массив любыми данными и вывести их на экран.

1. Метод createList должен объявлять и инициализировать массив с типом элементов ArrayList<String>.
2. Метод createList должен возвращать созданный массив.
3. Метод createList должен добавлять в массив элементы (списки строк). Списки должны быть не пустые.
4. Программа должна выводить данные на экран.
5. Метод main должен вызывать метод createList.
6. Метод main должен вызывать метод printList.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] list = new ArrayList[3];
        for (int i = 0; i < list.length; i++) {
            list[0] = new ArrayList<>();
            list[0].add("asdad1");
            list[0].add("asdad1");
            list[0].add("asdad1");

            list[1] = new ArrayList<>();
            list[1].add("asdad2");
            list[1].add("asdad2");

            list[2] = new ArrayList<>();
            list[2].add("asdad3");
            list[2].add("asdad3");
            list[2].add("asdad3");
            list[2].add("asdad3");
        }
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}