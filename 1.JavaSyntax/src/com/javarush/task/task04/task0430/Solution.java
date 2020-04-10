package com.javarush.task.task04.task0430;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 
От 1 до 10
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        
    }
}