package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);
        List<Integer> list = new ArrayList<>();
        while(inputStream.available() > 0){
            list.add(inputStream.read());
        }
        inputStream.close();
        reader.close();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), Collections.frequency(list, list.get(i)));
        }
        int min = Collections.min(map.values());
        map.forEach((k, v) -> {
                if(v.equals(min)){
                    System.out.print(k + " ");
                }
            }
        );
    }
}
