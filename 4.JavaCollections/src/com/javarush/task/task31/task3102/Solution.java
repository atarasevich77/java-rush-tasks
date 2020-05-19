package com.javarush.task.task31.task3102;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;


/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        File folder = new File(root);
        List<String> result = new ArrayList<>();
        Queue<File> fileTree = new PriorityQueue<>();

        Collections.addAll(fileTree, folder.listFiles());

        while (!fileTree.isEmpty()) {
            //we can use pool() or remove() methods
            File currentFile = fileTree.remove();
            if(currentFile.isDirectory()) {
                Collections.addAll(fileTree, currentFile.listFiles());
            } else {
                result.add(currentFile.getAbsolutePath());
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
//        Solution sol = new Solution();
//        List<String> list = new ArrayList<>();
//        list = sol.getFileTree("C:\\Users\\vika\\Downloads\\files_for_tests");
//        list.forEach(System.out::println);
    }
}
