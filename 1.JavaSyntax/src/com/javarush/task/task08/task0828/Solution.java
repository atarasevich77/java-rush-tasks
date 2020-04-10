package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

/* 
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используйте коллекции.

1. Программа должна считывать одно значение с клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна использовать коллекции.
4. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Map<Integer, String> months = new HashMap<>();
        months.put(1, "January"); months.put(2, "February"); months.put(3, "March"); months.put(4, "April");
        months.put(5, "May"); months.put(6, "June"); months.put(7, "July"); months.put(8, "August");
        months.put(9, "September"); months.put(10, "October"); months.put(11, "November"); months.put(12, "December");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

//        Map<Integer, String> months = Arrays
//                .stream(Month.values())
//                .collect(Collectors.toMap(Month::getValue, Enum::toString));

        months.forEach(
                (k, v) -> {
                    if(v.equals(month))
                        System.out.println(v + " is the " + k + " month");
                }
        );

//        for (Map.Entry<Integer, String> entry: months.entrySet()){
//            if(entry.getValue().equals(month)){
//                System.out.println(entry.getValue() + " is the " + entry.getKey() + " month");
//            }
//        }
    }
}
