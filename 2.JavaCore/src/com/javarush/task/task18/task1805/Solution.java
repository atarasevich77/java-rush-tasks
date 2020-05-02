package com.javarush.task.task18.task1805;

/* 
Сортировка байт
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
        Collections.sort(list);
        Set<Integer> set = new LinkedHashSet<>(list);
        set.forEach(v -> System.out.print(v + " "));
    }
}
