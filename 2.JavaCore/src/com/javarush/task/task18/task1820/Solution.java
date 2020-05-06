package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String fileName1 = reader.readLine();
//            String fileName1 = "C:\\Users\\vika\\Downloads\\files_for_tests\\1.txt";
            String fileName2 = reader.readLine();
//            String fileName2 = "C:\\Users\\vika\\Downloads\\files_for_tests\\2.txt";

            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(fileName1));
            byte[] inputData = new byte[inputStream.available()];
            inputStream.read(inputData, 0 , inputData.length);
            inputStream.close();

            List<String> numbers = new ArrayList<>(Arrays.asList(new String(inputData).split(" ")));
            StringBuilder result = new StringBuilder();
            for (String num: numbers) {
                result.append((int) Math.round(Double.parseDouble(num))).append(" ");
            }
            byte[] outputData = result.toString().getBytes();
            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(fileName2));
            outputStream.write(outputData);
            outputStream.close();

        } catch(Exception e){

        }
    }
}
