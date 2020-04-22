package com.javarush.task.task15.task1519;

import java.io.*;
import static jdk.nashorn.internal.runtime.JSType.isNumber;

/* 
Разные методы для разных типов
1. Программа должна считывать данные с клавиатуры.
2. Программа должна прекращать считывать данные с клавиатуры после того, как была введена строка "exit".
3. Если введенная строка содержит точку(".") и может быть корректно преобразована в число типа Double - должен быть вызван
метод print(Double value).
4. Если введенная строка может быть корректно преобразована в число типа short и полученное число больше 0,
но меньше 128 - должен быть вызван метод print(short value).
5. Если введенная строка может быть корректно преобразована в число типа Integer и полученное число меньше или равно 0
или больше или равно 128 - должен быть вызван метод print(Integer value).
6. Во всех остальных случаях должен быть вызван метод print(String value).
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while(!(str = reader.readLine()).equals("exit")){
            try{
                if(str.contains(".")){
                    double num = Double.parseDouble(str);
                    print(num);
                } else {
                    int num = Integer.parseInt(str);
                    if(num > 0 && num < 128) {
                        print((short)num);
                    } else {
                        print(num);
                    }
                }
            } catch (NumberFormatException e) {
                print(str);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
