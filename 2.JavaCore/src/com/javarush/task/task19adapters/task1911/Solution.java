package com.javarush.task.task19adapters.task1911;

/* 
Ридер обертка
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //1. Запоминаем настоящий PrintStream в специальную переменную
        PrintStream consoleStream = System.out;

        //2. Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //2.1 Создаем адаптер к классу PrintStream
        PrintStream printStream = new PrintStream(outputStream);
        //2.2 Устанавливаем его как текущий System.out
        System.setOut(printStream);

        //3. Вызываем функцию, которая ничего не знает о наших манипуляциях
        testString.printSomething();

        //4. Преобразовываем записанные в наш ByteArray данные в строку
        String result = outputStream.toString();

        //5. Возвращаем все как было
        System.setOut(consoleStream);

        //6. Увеличиваем буквы
        String capitalStr = result.toUpperCase();

        //5. Выводим ее в консоль
        System.out.println(capitalStr);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
