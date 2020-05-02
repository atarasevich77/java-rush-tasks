package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String fileName = reader.readLine();
//            String fileName = "C:\\Users\\vika\\Downloads\\test2.txt";
            FileInputStream inputStream = new FileInputStream(fileName);
            int count = 0;
            while(inputStream.available() > 0){
                int num = inputStream.read();
                if(num == 44){
                    count++;
                }
            }
            inputStream.close();
            reader.close();
            System.out.println(count);

        } catch (Exception e){

        }

    }
}
