package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
//        String filename = "C:\\Users\\vika\\Downloads\\files_for_tests\\13.txt";
        reader.close();

        BufferedReader fr = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = fr.readLine()) != null){
            for (Map.Entry<Integer, String> m : map.entrySet()) {
                line = line.replaceAll("\\b"+m.getKey().toString()+"\\b",m.getValue());
            }
            System.out.println(line);
        }
        fr.close();
    }
}
