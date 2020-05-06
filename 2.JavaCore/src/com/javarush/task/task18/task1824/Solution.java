package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
1. Программа должна считывать имена файлов с консоли.
2. Для каждого файла нужно создавать поток для чтения.
3. Если файл не существует, программа должна перехватывать исключение FileNotFoundException.
4. После перехвата исключения, программа должна вывести имя файла в консоль и завершить работу.
5. Потоки для чтения из файла должны быть закрыты.
6. Команду "System.exit();" использовать нельзя.
*/

import java.io.*;

public class Solution {
    private static boolean isExit = false;

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(!isExit){
            String fileName = reader.readLine();
            try {
                FileInputStream inputStream = new FileInputStream(fileName);
                inputStream.close();
            } catch (FileNotFoundException e) {
                isExit = true;
                System.out.println(fileName);
            }
        }

    }
}
