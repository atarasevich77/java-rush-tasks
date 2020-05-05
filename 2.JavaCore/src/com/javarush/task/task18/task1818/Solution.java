package com.javarush.task.task18.task1818;

/* 
Два в одном
C:\Users\vika\Downloads\files_for_tests\....
1. Программа должна три раза считать имена файлов с консоли.
2. Для первого файла создай поток для записи. Для двух других - потоки для чтения.
3. Содержимое второго файла нужно переписать в первый файл.
4. Содержимое третьего файла нужно дописать в первый файл (в который уже записан второй файл).
5. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            String fileName3 = reader.readLine();

            FileOutputStream outputStream = new FileOutputStream(fileName1, true);
            FileInputStream inputStream1 = new FileInputStream(fileName2);
            FileInputStream inputStream2 = new FileInputStream(fileName3);

            int i;
            while ((i = inputStream1.read()) != -1)
                outputStream.write(i);

            while ((i = inputStream2.read()) != -1)
                outputStream.write(i);

            inputStream1.close();
            inputStream2.close();
            outputStream.close();


        }catch(Exception e){
        }
    }
}
