package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String fileName1 = reader.readLine();
//            String fileName1 = "C:\\Users\\vika\\Downloads\\test2.txt";
            String fileName2 = reader.readLine();
//            String fileName2 = "C:\\Users\\vika\\Downloads\\test3.txt";
            String fileName3 = reader.readLine();
//            String fileName3 = "C:\\Users\\vika\\Downloads\\test4.txt";
            reader.close();

            FileInputStream inputStream = new FileInputStream(fileName1);
            FileOutputStream outStream1 = new FileOutputStream(fileName2);
            FileOutputStream outStream2 = new FileOutputStream(fileName3);

            byte[] inArray = new byte[inputStream.available()];
            inputStream.read(inArray);
            inputStream.close();

            if(inArray.length % 2 == 0){
                outStream1.write(inArray, 0, (inArray.length / 2));
                outStream2.write(inArray, (inArray.length/2), (inArray.length/2));
            } else {
                outStream1.write(inArray, 0, (inArray.length / 2) + 1);
                outStream2.write(inArray, (inArray.length/2) + 1, (inArray.length/2));
            }
            outStream1.close();
            outStream2.close();

        } catch (Exception e){
        }
    }
}
