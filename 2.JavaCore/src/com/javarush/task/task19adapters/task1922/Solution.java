package com.javarush.task.task19adapters.task1922;

import java.io.*;
import java.util.*;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
//        String fileName = "C:\\Users\\vika\\Downloads\\files_for_tests\\12.txt";
        reader.close();

        BufferedReader fr = new BufferedReader(new FileReader(fileName));
        while (fr.ready()) {
            String str = fr.readLine();
            List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
            int count = 0;
            for (String s : words) count += Collections.frequency(list, s);
            if (count == 2) System.out.println(str);
        }
        fr.close();
    }
}
