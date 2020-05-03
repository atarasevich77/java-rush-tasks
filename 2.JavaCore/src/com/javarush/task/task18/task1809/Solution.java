package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String fileName1 = reader.readLine();
//            String fileName1 = "C:\\Users\\vika\\Downloads\\test2.txt";
            String fileName2 = reader.readLine();
//            String fileName2 = "C:\\Users\\vika\\Downloads\\test4.txt";

            FileInputStream inputStream = new FileInputStream(fileName1);
            FileOutputStream outputStream = new FileOutputStream(fileName2);

            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            for (int i = buffer.length-1; i >= 0; i--) {
                outputStream.write(buffer[i]);
            }
            inputStream.close();
            outputStream.close();

        } catch(Exception e){

        }
    }
}
