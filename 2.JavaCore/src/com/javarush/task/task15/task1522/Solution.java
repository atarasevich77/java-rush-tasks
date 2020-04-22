package com.javarush.task.task15.task1522;

/* 
Закрепляем паттерн Singleton
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static{
            readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String str = reader.readLine();

            if(str.equals(Planet.SUN)){
                thePlanet = Sun.getInstance();
            } else if(str.equals(Planet.MOON)) {
                thePlanet = Moon.getInstance();
            } else if(str.equals(Planet.EARTH)) {
                thePlanet = Earth.getInstance();
            } else {
                thePlanet = null;
            }

//            switch(str){
//                case Planet.SUN:
//                    thePlanet = Sun.getInstance();
//                case Planet.MOON:
//                    thePlanet = Moon.getInstance();
//                case Planet.EARTH:
//                    thePlanet = Earth.getInstance();
//                default:
//                    thePlanet = null;
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
