package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
Сделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) - возвращает строку повторенную count раз.
String multiply(String s) - возвращает строку повторенную 5 раз.

1. Программа не должна считывать данные с клавиатуры.
2. Методы класса StringHelper должны возвращать строку.
3. Методы класса StringHelper должны быть статическими.
4. Методы класса StringHelper должны быть public.
5. Метод multiply(String s, int count) должен возвращать строку повторенную count раз.
6. Метод multiply(String s) должен возвращать строку повторенную 5 раз.
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        //напишите тут ваш код
        for (int i = 0; i < 5; i++) {
            result += s;
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        //напишите тут ваш код
        for (int i = 0; i < count; i++) {
            result += s;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
