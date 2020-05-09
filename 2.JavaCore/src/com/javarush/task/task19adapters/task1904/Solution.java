package com.javarush.task.task19adapters.task1904;

/* 
И еще один адаптер
*/

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner){
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String line = fileScanner.nextLine();
            String[] arrayString = line.split(" ");
            String lastName = arrayString[0];
            String firstName = arrayString[1];
            String middleName = arrayString[2];
            String stringDate = line.substring(line.indexOf(arrayString[3]));
            Date date = new SimpleDateFormat("dd MM yyyy").parse(stringDate);

            return new Person(firstName, middleName, lastName, date);
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
