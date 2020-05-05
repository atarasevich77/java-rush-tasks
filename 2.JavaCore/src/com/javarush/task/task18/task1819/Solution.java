package com.javarush.task.task18.task1819;

/* 
Объединение файлов
C:\Users\vika\Downloads\files_for_tests\....
1. Программа должна два раза считать имена файлов с консоли.
2. Не используй в программе статические переменные.
3. Для первого файла создай поток для чтения и считай его содержимое.
4. Затем, для первого файла создай поток для записи(поток для записи должен быть один). Для второго - для чтения.
5. Содержимое первого и второго файла нужно объединить в первом файле.
6. Сначала должно идти содержимое второго файла, затем содержимое первого.
7. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();

            FileInputStream inputStream = new FileInputStream(fileName1);
            byte[] buffer1 = new byte[inputStream.available()];
            int count1 = inputStream.read(buffer1);

            FileInputStream inputStream2 = new FileInputStream(fileName2);
            byte[] buffer2 = new byte[inputStream2.available()];
            int count2 = inputStream2.read(buffer2);

            FileOutputStream outputStream = new FileOutputStream(fileName1);

            outputStream.write(buffer2, 0, count2);
            outputStream.write(buffer1, 0, count1);

            outputStream.close();
            inputStream2.close();
            inputStream.close();
        } catch(Exception e){
        }
    }
}
