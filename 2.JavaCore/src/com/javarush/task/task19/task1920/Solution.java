package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String filename = args[0];
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        Map<String, Double> map = new TreeMap<>();
        while((line = reader.readLine()) != null){
            String[] aLine = line.split(" ");
            String name = aLine[0];
            Double value = Double.parseDouble(aLine[1]);
            if(map.containsKey(name)){
                value = map.get(name) + value;
            }
            map.put(name, value);
        }
        reader.close();

        Double maxValue = (Collections.max(map.values()));
        map.forEach(
                (k, v) -> {
                    if(v.equals(maxValue)){
                        System.out.println(k);
                    }
                }
        );
    }
}
