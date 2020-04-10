package com.javarush.task.task08.task0802;

/* 
Map из 10 пар
    Объяви переменную коллекции Map с типом элементов String, String и сразу проинициализируй ee.
    Программа не должна считывать значения с клавиатуры.
    Программа должна добавлять в коллекцию 10 пар строк, согласно условию.
    Программа должна выводить содержимое коллекции на экран, каждую пару с новой строки.
*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for (Map.Entry<String, String> str: map.entrySet()) {
            String key = str.getKey();
            String value = str.getValue();
            System.out.println(key + " - "+value);
        }

    }
}
