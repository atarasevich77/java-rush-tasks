package com.javarush.task.task18.task1826;

/* 
Шифровка
1. Считывать с консоли ничего не нужно.
2. Создай поток для чтения из файла, который приходит вторым параметром ([fileName]).
3. Создай поток для записи в файл, который приходит третьим параметром ([fileOutputName]).
4. В режиме "-e" программа должна зашифровать [fileName] и записать в [fileOutputName].
5. В режиме "-d" программа должна расшифровать [fileName] и записать в [fileOutputName].
6. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Solution {
    public static void main(String[] args) throws IOException {
        String param = args[0];
        String fileName = args[1];
        String fileOutputName = args[2];

        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(fileName));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(fileOutputName));
        switch(param){
            case "-e":
                encodeData(inputStream, outputStream);
                break;
            case "-d":
                decodeData(inputStream, outputStream);
                break;
        }
        inputStream.close();
        outputStream.close();
    }

    private static void encodeData(BufferedInputStream inputStream, BufferedOutputStream outputStream) throws IOException {
        while (inputStream.available() > 0){
            int data = inputStream.read() + 1;
            outputStream.write(data);
        }
    }

    private static void decodeData(BufferedInputStream inputStream, BufferedOutputStream outputStream) throws IOException {
        while (inputStream.available() > 0){
            int data = inputStream.read() + 1;
            outputStream.write(data);
        }
    }
}
