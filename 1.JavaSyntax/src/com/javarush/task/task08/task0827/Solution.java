package com.javarush.task.task08.task0827;

/* 
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false

1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().
*/

import java.text.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("MMM d yyyy", Locale.ENGLISH);
        Date endDate = format.parse(date);
        long end = endDate.getTime();

        endDate.setDate(1);
        endDate.setMonth(0);
        long start = endDate.getTime();

        long diffDays = ((end / (1000 * 60 * 60 * 24)) - (start / (1000 * 60 * 60 * 24))) + 1;
//        System.out.println(diffDays);
        if(diffDays % 2 == 0) {
            return false;
        }
        return true;
    }
}
