package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.*;
import java.io.PrintStream;
import java.util.Arrays;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        testString.printSomething();
        String result = outputStream.toString();

        System.setOut(consoleStream);

        addAdvertisement(result);
    }

    public static void addAdvertisement(String str){
        String[] aStr = str.split("\\n");
        for (int i = 0; i < aStr.length; i++) {
            System.out.println(aStr[i]);
            if(i%2 != 0){
                System.out.println("JavaRush - курсы Java онлайн");
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
