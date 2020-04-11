package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить две строки.
3. Первая строка должна содержать только гласные буквы из введенной строки, разделенные пробелом.
4. Вторая строка должна содержать только согласные и знаки препинания из введенной строки, разделенные пробелом.
5. Каждая строка должна заканчиваться пробелом.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        char[] chairs = string.toCharArray();
        String vowel = "";
        String notVowel = "";
        for (int i = 0; i < chairs.length; i++) {
            if(!Character.isWhitespace(chairs[i])){
                if(isVowel(chairs[i]))
                {
                    vowel += chairs[i] + " ";
                } else {
                    notVowel += chairs[i] + " ";
                }
            }
        }
        System.out.println(!vowel.equals(" ") ? vowel + " " : vowel);
        System.out.println(!notVowel.equals(" ") ? notVowel + " " : notVowel);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}