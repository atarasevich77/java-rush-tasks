package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.

1. Программа не должна считывать данные с клавиатуры.
2. В классе Human должно быть 6 полей.
3. Все поля класса Human должны быть private.
4. В классе Human должно быть 10 конструкторов.
5. Все конструкторы класса Human должны быть public.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String firstName;
        private String lastName;
        private boolean sex;
        private int age;
        private double weight;
        private double height;

        public Human() { }

        public Human(String firstName) {
            this.firstName = firstName;
        }

        public Human(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(double weight, double height) {
            this.weight = weight;
            this.height = height;
        }

        public Human(String firstName, String lastName, boolean sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
        }

        public Human(String firstName, String lastName, boolean sex, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
        }

        public Human(String firstName, String lastName, double weight, double height) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.weight = weight;
            this.height = height;
        }

        public Human(String firstName, String lastName, boolean sex, double weight, double height) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
        }

        public Human(String firstName, String lastName, boolean sex, int age, double weight) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
        }

        public Human(String firstName, String lastName, boolean sex, int age, double weight, double height) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }
    }
}
