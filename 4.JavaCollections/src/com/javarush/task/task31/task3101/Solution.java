package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.*;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        File folder = new File(args[0]);
        File source = new File(args[1]);

        //1. Rename the file
        File destination = new File(source.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(source, destination);

        //2.Check and save the fileResult
        //3.1. Отсортировать их по имени файла в возрастающем порядке, путь не учитывать при сортировке.
        Map<String, String> map = new TreeMap<>();
        Queue<File> queue = new PriorityQueue<>();
        Collections.addAll(queue, folder.listFiles());

        while (!queue.isEmpty()){
            File currentFile = queue.remove();
            String filename = currentFile.getName();
            String ext = filename.substring(filename.lastIndexOf(".") + 1);
            if (currentFile.isDirectory()){
                Collections.addAll(queue, currentFile.listFiles());
            }else if(currentFile.length() <= 50 && ext.equals("txt")) {
                map.put(currentFile.getName(), currentFile.getAbsolutePath());
            }
        }

        FileInputStream inputStream;
        FileOutputStream fileOutputStream = new FileOutputStream(destination, true);
        for (Map.Entry<String, String> value : map.entrySet()){
            //3.2. В allFilesContent.txt последовательно записать содержимое всех файлов из п. 3.1.
            // После каждого тела файла записать "\n".
            inputStream = new FileInputStream(value.getValue());
            byte[] buff = new byte[inputStream.available()];
            int count = inputStream.read(buff);
            fileOutputStream.write(buff);
            fileOutputStream.write("\n".getBytes());
            inputStream.close();
        }
        fileOutputStream.close();
    }
}
