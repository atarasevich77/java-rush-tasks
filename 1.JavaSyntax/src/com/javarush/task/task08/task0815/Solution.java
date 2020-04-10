package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.

Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Ooo", "aaa");map.put("Yyy", "aaa");map.put("Aaa", "ddd");map.put("Bbb", "ccc");map.put("Ttt", "nnn");
        map.put("Eee", "ddd");map.put("Ccc", "ddd");map.put("Ggg", "ccc");map.put("Xxx", "uuu");map.put("Lll", "nnn");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String value: map.values()) {
            if(value.equals(name)){
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (String key: map.keySet()) {
            if(key.equals(lastName)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
    }
}
