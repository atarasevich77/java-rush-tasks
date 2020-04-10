package com.javarush.task.task08.task0817;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.

1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Wwww", "aaa");map.put("Yyyw", "aaa");map.put("Awaa", "rrr");map.put("Bwbb", "ccc");map.put("Twtt", "nnn");
        map.put("Eewe", "ddd");map.put("Ccwc", "ddd");map.put("Gwgg", "ccc");map.put("Xxwx", "uuu");map.put("Lwll", "nnn");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        List<String> list = new ArrayList<>();
        List<String> doubleList = new ArrayList<>();

        Iterator<String> itr = map.values().iterator();
        while(itr.hasNext()){
            String value = itr.next();
            if(list.contains(value)){
                doubleList.add(value);
            } else {
                list.add(value);
            }
        }
        for (int i = 0; i < doubleList.size(); i++) {
            removeItemFromMapByValue(map, doubleList.get(i));
        }
//        System.out.println(map);
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
