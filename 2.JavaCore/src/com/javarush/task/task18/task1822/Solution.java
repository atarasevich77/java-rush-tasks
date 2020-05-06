package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();
//            String fileName = "C:\\Users\\vika\\Downloads\\files_for_tests\\test4.txt";
            BufferedReader input = new BufferedReader(new FileReader(fileName));
            String inputString;
            while ((inputString = input.readLine()) != null) {
                if (inputString.startsWith(args[0] + " ")) System.out.println(inputString);
            }
            input.close();
        }catch(Exception e){

        }
    }
}
