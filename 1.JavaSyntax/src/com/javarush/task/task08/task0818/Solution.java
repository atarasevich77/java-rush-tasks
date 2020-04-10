package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.

1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
4. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Sidorov", 1500);map.put("Petrov", 1000);map.put("Ivanov", 1000);map.put("Molodov", 600);
        map.put("Ogurcov", 500);map.put("Zlodi", 500);map.put("Gogin", 400);map.put("Lololo", 350);
        map.put("Akopyan", 300);map.put("Kakademon", 100);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator itr = map.values().iterator();
        while (itr.hasNext()){
            int zp = (int) itr.next();
            if(zp < 500){
                itr.remove();
            }
        }
    }

    public static void main(String[] args) {
    }
}