package com.javarush.task.task08.task0816;

import java.text.*;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.

1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
4. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("www", dateFormat.parse("MAY 1 2012"));
        map.put("qqq", dateFormat.parse("JUNE 1 2012"));
        map.put("eee", dateFormat.parse("JULY 1 2012"));
        map.put("aaa", dateFormat.parse("MAY 1 2012"));
        map.put("sss", dateFormat.parse("MAY 1 2012"));
        map.put("ddd", dateFormat.parse("MAY 1 2012"));
        map.put("fff", dateFormat.parse("AUGUST 1 2012"));
        map.put("zzz", dateFormat.parse("MAY 1 2012"));
        map.put("xxx", dateFormat.parse("MAY 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) throws ParseException {
        //напишите тут ваш код
        Iterator <Map.Entry<String, Date>> itr = map.entrySet().iterator();
        while (itr.hasNext())
        {
            Date date = itr.next().getValue();
            if(date.getMonth() == 5 || date.getMonth() == 6 || date.getMonth() == 7)
                itr.remove();
        }
    }

    public static void main(String[] args) throws ParseException {
    }
}
