package com.javarush.task.task08.task0804;

import java.util.HashMap;
import java.util.Map;

/* 
Вывести на экран список ключей
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map) {
        //напишите тут ваш код
        System.out.println("==========forEach - all map==========");
        for(Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey());
        }
        System.out.println("==========forEach - only keys========");
        for (String key: map.keySet()) {
            System.out.println(key);
        }
        System.out.println("==========Lambda function for========");
        map.forEach(
                (k, v) -> System.out.println(k)
        );
    }
}
