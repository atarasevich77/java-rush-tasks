package com.javarush.task.task18.task1828;
/*
Прайсы 2
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> db;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        switch (args[0]) {

            case ("-d"): //Delete by ID
                db = readFile(filename); // read file to list
                db = delFromDBbyID(db, Integer.parseInt(args[1]));

                writeDBtoFile(db, filename);
                break;

            case ("-u"): //Update by ID
                db = readFile(filename); // read file to list
                db = updateDB(db, Integer.parseInt(args[1]), args[2], args[3], args[4]);

                writeDBtoFile(db, filename);
                break;
        }
    }

    public static ArrayList<String> readFile(String filename) throws IOException {

        FileInputStream inputStream = new FileInputStream(filename);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        ArrayList<String> db = new ArrayList<>();

        String line = reader.readLine();
        while (line != null) {
            db.add(line);
            line = reader.readLine();
        }

        reader.close();
        inputStream.close();

        return db;
    }

    public static ArrayList<String> delFromDBbyID(ArrayList<String> db, int id) {
        ArrayList<String> editDB = new ArrayList<>(db);

        for (String str : db) {
            int checkID = Integer.parseInt(str.substring(0, 8).replaceAll("\\s", ""));
            if (checkID == id) editDB.remove(str);
        }

        return editDB;
    }

    public static ArrayList<String> updateDB(ArrayList<String> db, int id, String productName, String price, String quantity) {

        ArrayList<String> editDB = new ArrayList<>(db);

        for (String str : editDB) {
            int checkID = Integer.parseInt(str.substring(0, 8).trim());
            if (checkID == id) {
                String writeString = String.format("%-8s%-30s%-8s%-4s", id, productName, price, quantity);
                editDB.set(editDB.indexOf(str), writeString);
            }
        }
        return editDB;
    }

    public static void writeDBtoFile(ArrayList<String> db, String filename) throws IOException {

        FileOutputStream outputStream = new FileOutputStream(filename);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

        for(int i = 0; i < db.size(); i++){
            writer.write(db.get(i));
            if(i != (db.size()-1)) writer.newLine();
        }

        writer.close();
        outputStream.close();
    }
}
