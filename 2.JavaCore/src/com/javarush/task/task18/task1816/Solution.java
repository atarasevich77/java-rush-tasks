package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        FileInputStream inputStream = new FileInputStream(fileName);
        int count = 0;
        while(inputStream.available() > 0){
            int simbol = inputStream.read();
            if(simbol >= 'A' & simbol <= 'Z' || simbol >= 'a' & simbol <= 'z')
                count++;
        }
        inputStream.close();
        System.out.println(count);
    }
}
