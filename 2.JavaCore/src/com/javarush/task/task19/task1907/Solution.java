package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
//        String fileName = "C:\\Users\\vika\\Downloads\\files_for_tests\\finalFile.txt";
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        int count = 0;
        while(fileReader.ready()){
            for (String s : fileReader.readLine().split("\\W")) {
                if (s.equals("world")) {
                    count++;
                }
            }
        }
        System.out.println(count);
        fileReader.close();
    }
}
