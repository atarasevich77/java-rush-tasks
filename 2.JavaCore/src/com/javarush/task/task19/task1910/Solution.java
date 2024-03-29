package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNameFrom = reader.readLine();
//        String fileNameFrom = "C:\\Users\\vika\\Downloads\\files_for_tests\\3.txt";
        String fileNameTo = reader.readLine();
//        String fileNameTo = "C:\\Users\\vika\\Downloads\\files_for_tests\\4.txt";
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileNameFrom));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileNameTo));

        while (fileReader.ready()){
            String line = fileReader.readLine();
            fileWriter.write(line.replaceAll("\\p{Punct}", ""));
        }
        fileReader.close();
        fileWriter.close();
    }
}
