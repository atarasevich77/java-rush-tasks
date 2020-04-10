package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
1. Программа должна считывать строки c клавиатуры.
2. Программа должна использовать команду System.out.println() или System.out.print().
3. Если возраст больше 20 вывести только сообщение "И 18-ти достаточно".
4. Если возраст меньше либо равно 20 ничего не выводить.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        String sAge = br.readLine();
        int age = Integer.parseInt(sAge);
        if(age > 20){
            System.out.println("И 18-ти достаточно");
        }
    }
}
