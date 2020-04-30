package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
-c name sex bd
-u id name sex bd
-d id
-i id
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        //start here - начни тут
//        -c Mironova ж 15/04/1900
//        -c Mironov м 15/04/1900
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Person person;
        int index;
        switch(args[0]) {
            case "-c":
                String name = args[1];
                Date date = format.parse(args[3]);
                if (args[2].equals("м")) {
                    allPeople.add(Person.createMale(name, date));
                    System.out.println(allPeople.size() - 1);
                } else if (args[2].equals("ж")) {
                    allPeople.add(Person.createFemale(name, date));
                    System.out.println(allPeople.size() - 1);
                }
                break;
            case "-u":
                index = Integer.parseInt(args[1]);
                person = allPeople.get(index);
                person.setName(args[2]);
                if (args[3].equals("м")) {
                    person.setSex(Sex.MALE);
                } else if (args[3].equals("ж")) {
                    person.setSex(Sex.FEMALE);
                }
                person.setBirthDate(format.parse(args[4]));
                break;
            case "-d":
                index = Integer.parseInt(args[1]);
                person = allPeople.get(index);
                person.setName(null);
                person.setSex(null);
                person.setBirthDate(null);
                break;
            case "-i":
                index = Integer.parseInt(args[1]);
                person = allPeople.get(index);
                SimpleDateFormat sf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                System.out.println(
                        person.getName() + " " +
                        ((person.getSex() == Sex.MALE) ? "м" : "ж") + " " +
                        sf.format(person.getBirthDate())
                );
                break;
        }
    }
}
