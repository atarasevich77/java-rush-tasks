package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        try {
            String fileName1 = reader.readLine();
//            String fileName1 = "C:\\Users\\vika\\Downloads\\test.txt";
            allLines = parseDataFromFile(fileName1);

            String fileName2 = reader.readLine();
//            String fileName2 = "C:\\Users\\vika\\Downloads\\test2.txt";
            forRemoveLines = parseDataFromFile(fileName2);

            new Solution().joinData();

            reader.close();
        } catch (CorruptedDataException e) {
        } catch (IOException e) {
        } catch (Exception e) {
        }
    }

    public static List<String> parseDataFromFile(String fileName) throws Exception {
        List<String> result = new ArrayList<>();
        File file = new File(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String string;
        while((string = br.readLine()) != null){
            result.add(string);
        }
        return result;
    }

    public void joinData() throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines)){
            for(String remLine: forRemoveLines){
                if(allLines.contains(remLine)){
                    System.out.println(remLine);
                    allLines.remove(remLine);
                }
            }
        } else {
            allLines.clear();
            System.out.println(allLines);
            throw new CorruptedDataException();
        }
    }
}
