package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        String fileName = args[0];
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while((line = reader.readLine()) != null){
            String name = line.replaceAll("\\d", "").trim();
            SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
            Date birthDate = format.parse(line.replaceAll("\\D", " "));
            PEOPLE.add(new Person(name, birthDate));
        }
        reader.close();
    }
}
