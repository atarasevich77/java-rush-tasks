package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
//        String fileName = "C:\\Users\\vika\\Downloads\\files_for_tests\\12.txt";
        reader.close();

        BufferedReader fr = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = fr.readLine()) != null){
            StringBuffer sBuffer = new StringBuffer(line);
            sBuffer.reverse();
            System.out.println(sBuffer);
        }
        fr.close();
    }
}
