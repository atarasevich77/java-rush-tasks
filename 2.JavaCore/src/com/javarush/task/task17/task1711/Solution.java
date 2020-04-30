package com.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        //start here - начни тут
//        -c Mironova ж 15/04/1900 Mironov м 20/12/1905
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Person person;
        int index = 0;
        String name = null;
        String sex = null;
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        if (i % 3 == 1) {
                            name = args[i];
                        }
                        if (i % 3 == 2) {
                            sex = args[i];
                        }
                        if (i % 3 == 0) {
                            Date date = format.parse(args[i]);
                            if (sex.equals("м")) {
                                allPeople.add(Person.createMale(name, date));
                                System.out.println(allPeople.size() - 1);
                            } else if (sex.equals("ж")) {
                                allPeople.add(Person.createFemale(name, date));
                                System.out.println(allPeople.size() - 1);
                            }
                            continue;
                        }
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        if (i % 4 == 1) {
                            index = Integer.parseInt(args[i]);
                        }
                        if (i % 4 == 2) {
                            name = args[i];
                        }
                        if (i % 4 == 3) {
                            sex = args[i];
                        }
                        if (i % 4 == 0) {
                            person = allPeople.get(index);
                            person.setName(name);
                            if (sex.equals("м")) {
                                person.setSex(Sex.MALE);
                            } else if (sex.equals("ж")) {
                                person.setSex(Sex.FEMALE);
                            }
                            person.setBirthDate(format.parse(args[i]));
                            continue;
                        }
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        if (i % 1 == 0) {
                            index = Integer.parseInt(args[i]);
                            person = allPeople.get(index);
                            person.setName(null);
                            person.setSex(null);
                            person.setBirthDate(null);
                            continue;
                        }
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        if (i % 1 == 0) {
                            index = Integer.parseInt(args[i]);
                            person = allPeople.get(index);
                            SimpleDateFormat sf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                            System.out.println(
                                    person.getName() + " "
                                            + ((person.getSex() == Sex.MALE) ? "м" : "ж") + " "
                                            + sf.format(person.getBirthDate())
                            );
                            continue;
                        }
                    }
                }
                break;
        }
    }
}
