package com.javarush.task.task15.task1525;

import java.io.*;

import java.util.*;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {
        try {
            File file = new File(Statics.FILE_NAME);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String str;
            while((str = reader.readLine()) != null){
                lines.add(str);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println(lines);
    }
}
