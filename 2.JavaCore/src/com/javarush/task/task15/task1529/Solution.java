package com.javarush.task.task15.task1529;

/* 
Осваивание статического блока
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String input = reader.readLine();
            if (input.equals("helicopter")) {
                Solution.result = new Helicopter();
            }
            if (input.equals("plane")) {
                int passengerAmount = Integer.parseInt(reader.readLine());
                Solution.result = new Plane(passengerAmount);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
