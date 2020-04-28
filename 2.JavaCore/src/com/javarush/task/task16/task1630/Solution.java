package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.*;

/*
1. Статический блок класса Solution должен считывать с консоли имена двух файлов и сохранять их в переменные
firstFileName и secondFileName.
2. Объяви в классе Solution public static класс ReadFileThread.
3. Класс ReadFileThread должен реализовывать интерфейс ReadFileInterface.
4. Класс ReadFileThread должен быть унаследован от подходящего класса.
5. Метод run класса ReadFileThread должен считывать строки из файла, установленного методом setFileName.
А метод getFileContent, этого же класса, должен возвращать вычитанный контент. Возвращаемое значение - это одна строка, состоящая из строк файла, разделенных пробелами.
6. Метод systemOutPrintln должен вызывать метод join у созданного объекта f.
7. Вывод программы должен состоять из 2х строк. Каждая строка - содержимое одного файла.
* */
public class Solution {
    public static String firstFileName;
    public static String secondFileName;
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //add your code here - добавьте код тут
    static {
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
//            firstFileName = "C:\\Users\\vika\\Downloads\\test.txt";
//            secondFileName = "C:\\Users\\vika\\Downloads\\test2.txt";

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private List<String> list = new ArrayList<>();
//        public volatile Thread thread = new Thread(this);
        private String fileName;

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            String result = "";
            for (String str: list) {
                result += str + " ";
            }
            return result;
        }

        @Override
        public void run() {
            try {
                File file = new File(fileName);
                BufferedReader br = new BufferedReader(new FileReader(file));
                String string;
                while ((string = br.readLine()) != null){
                    list.add(string);
                }
            } catch (Exception e) {

            }
        }
    }
}
