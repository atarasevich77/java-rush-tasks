package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        BufferedInputStream buffer = new BufferedInputStream(inputStream);
        int allSymbols = 0;
        int allSpaces = 0;
        int symbol;
        while((symbol = buffer.read()) != -1){
            allSymbols++;
            if(Character.isSpaceChar((char)symbol)){
                allSpaces++;
            }
        }
        inputStream.close();
        System.out.printf("%.2f", (double) allSpaces / allSymbols * 100);
    }
}
