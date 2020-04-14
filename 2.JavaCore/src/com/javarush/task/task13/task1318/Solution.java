package com.javarush.task.task13.task1318;

/* 
Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.

1. Программа должна считывать c консоли имя файла.
2. Программа должна выводить на экран содержимое файла.
3. Поток чтения из файла (FileInputStream) должен быть закрыт.
4. BufferedReader также должен быть закрыт.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        InputStream input = new FileInputStream(fileName);

        /*Output with BufferedReader it's a preferred options
        BufferedReader buffer = new BufferedReader(new InputStreamReader(input));
        while(buffer.ready()){
            System.out.println(buffer.readLine());
        }
        */

        /* Output without BufferedReader
        int i;
        while((i = input.read()) != -1){
            System.out.print((char)i);
        }
        */

        //Fast output with BufferedInputStream (200th streams!!!)
        BufferedInputStream bInput = new BufferedInputStream(input, 200);
        int i;
        while((i = bInput.read()) != -1){
            System.out.print((char)i);
        }

        input.close();
        bInput.close();
//        buffer.close();
        reader.close();
    }
}