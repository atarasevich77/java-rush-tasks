package com.javarush.task.task18.task1810;

/* 
DownloadException
C:\Users\vika\Downloads\test4.txt
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String fileName = reader.readLine();
            FileInputStream inputStream = new FileInputStream(fileName);
            if (inputStream.available() < 1000) {
                reader.close();
                inputStream.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
