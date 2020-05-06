package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        while (!fileName.equals("exit")) {
            ReadThread readThread = new ReadThread(fileName);
            readThread.start();
            readThread.join();
            fileName = reader.readLine();
        }
    }

    public static class ReadThread extends Thread {

        public ReadThread(String fileName) throws IOException {
            //implement constructor body
            this.fileName = fileName;
            FileInputStream inputStream = new FileInputStream(fileName);
            while (inputStream.available() > 0) list.add(inputStream.read());
            inputStream.close();
        }

        private String fileName = null;
        ArrayList<Integer> list = new ArrayList<>();
        // implement file reading here - реализуйте чтение из файла тут
        @Override
        public void run() {
            int element = list.get(0);
            for (Integer x : list) if (Collections.frequency(list, x) > Collections.frequency(list, element)) element = x;
            resultMap.put(fileName, element);
        }
    }
}
