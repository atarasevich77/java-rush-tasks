package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileNameIn = args[0];
        String fileNameOut = args[1];

        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileNameIn));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileNameOut));
        String line;
        while((line = reader.readLine()) != null){
            String[] aStr = line.split(" ");
            for (int i = 0; i < aStr.length; i++){
                if(aStr[i].length() > 6){
                    list.add(aStr[i]);
                }
            }
        }
        reader.close();
        for (int i = 0; i < list.size(); i++) {
            String str = (i != (list.size()-1)) ? list.get(i) + "," : list.get(i);
            writer.write(str);
        }
        writer.close();
    }
}
