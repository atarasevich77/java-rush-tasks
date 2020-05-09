package com.javarush.task.task19adapters.task1919;

/* 
Считаем зарплаты
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String line;
        Map<String, Double> map = new TreeMap<>();
        while ((line = reader.readLine()) != null){
            String[] aLine = line.split(" ");
            String name = aLine[0];
            Double value = Double.parseDouble(aLine[1]);
            if(map.containsKey(name)){
                value = map.get(name) + value;
            }
            map.put(name, value);
        }
        reader.close();

        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
