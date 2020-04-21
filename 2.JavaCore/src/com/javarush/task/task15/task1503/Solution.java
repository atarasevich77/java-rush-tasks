package com.javarush.task.task15.task1503;

/* 
ООП - машинки
1. Класс Solution должен содержать public static класс LuxuriousCar.
2. Класс Solution должен содержать public static класс CheapCar.
3. Класс Ferrari должен быть потомком класса LuxuriousCar.
4. Класс Lanos должен быть потомком класса CheapCar.
5. Метод printlnDesire в классе LuxuriousCar, должен выводить на экран фразу "Я хочу ездить на роскошной машине".
6. Метод printlnDesire в классе CheapCar, должен выводить на экран фразу "Я хочу ездить на дешевой машине".
7. Метод printlnDesire в классе Ferrari, должен выводить на экран фразу "Я хочу ездить на Феррари".
8. Метод printlnDesire в классе Lanos, должен выводить на экран фразу "Я хочу ездить на Ланосе".
9. Область видимости методов printlnDesire в классах Ferrari и Lanos должна быть шире, чем в их классах родителях.
*/

public class Solution {
    public static void main(String[] args) {
        new Solution.LuxuriousCar().printlnDesire();
        new Solution.CheapCar().printlnDesire();
        new Solution.Ferrari().printlnDesire();
        new Solution.Lanos().printlnDesire();
    }

    public static class Ferrari extends LuxuriousCar {
        public void printlnDesire() {
            //add your code here
            System.out.println(Constants.WANT_STRING + Constants.FERRARI_NAME);
        }
    }

    public static class Lanos extends CheapCar {
        public void printlnDesire() {
            //add your code here
            System.out.println(Constants.WANT_STRING + Constants.LANOS_NAME);
        }
    }

    public static class Constants {
        public static String WANT_STRING = "Я хочу ездить на ";
        public static String LUXURIOUS_CAR = "роскошной машине";
        public static String CHEAP_CAR = "дешевой машине";
        public static String FERRARI_NAME = "Феррари";
        public static String LANOS_NAME = "Ланосе";
    }

    public static class LuxuriousCar {
        void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.LUXURIOUS_CAR);
        }
    }

    public static class CheapCar {
        void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.CHEAP_CAR);
        }
    }
}
