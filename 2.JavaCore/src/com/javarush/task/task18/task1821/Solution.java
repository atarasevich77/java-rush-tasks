package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(args[0]));
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes, 0, bytes.length);
        inputStream.close();

        Map<Byte, Integer> data = new TreeMap<>();
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            if(data.containsKey(b)){
                data.put(b, ((int)data.get(b) + 1));
            } else {
                data.put(b, 1);
            }
        }
        for (Map.Entry<Byte, Integer> entry: data.entrySet()) {
            byte symbol = entry.getKey();
            System.out.println((char)symbol + " " + entry.getValue());
        }
    }
}
