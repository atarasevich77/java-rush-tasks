package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = args[0];
        String fileName2 = args[1];

        BufferedReader reader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));

        String line;
        String regex = ".*\\d.*";
        while ((line = reader.readLine()) != null){
            String[] aStr = line.split(" ");
            for (String str: aStr) {
                if(str.matches(regex))
                    writer.write(str+ " ");
            }
        }
        reader.close();
        writer.close();
    }
}
