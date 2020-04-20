package com.javarush.task.task14.task1416;

/* 
Исправление ошибок
1. Косатка(Orca) является животным океана(потомком OceanAnimal) и умеет плавать(поддерживает интерфейс Swimmable).
2. Кит(Whale) является животным океана(потомком OceanAnimal) и умеет плавать(поддерживает интерфейс Swimmable).
3. Выдра(Otter) умеет ходить(поддерживает интерфейс Walkable) и плавать(поддерживает интерфейс Swimmable).
4. Выдра(Otter) НЕ является животным океана(потомком OceanAnimal).
5. Кит(Whale) и Косатка(Orca) НЕ умеют ходить(не поддерживают интерфейс Walkable).
*/

public class Solution {
    public static void main(String[] args) {
        Swimmable animal = new Orca();
        animal.swim();
        animal = new Whale();
        animal.swim();
        animal = new Otter();
        animal.swim();
    }

    public static void test(Swimmable animal) {
        animal.swim();
    }

    interface Walkable {
        void walk();
    }

    interface Swimmable {
        void swim();
    }

    static abstract class OceanAnimal implements Swimmable{
        public void swim() {
            OceanAnimal currentAnimal = (OceanAnimal) getCurrentAnimal();
            currentAnimal.displaySwim();
        }

        private void displaySwim() {
            System.out.println(getCurrentAnimal().getClass().getSimpleName() + " is swimming");
        }

        abstract Swimmable getCurrentAnimal();
    }

    static class Orca extends OceanAnimal {
        @Override
        Swimmable getCurrentAnimal() {
            return this;
        }
    }

    static class Whale extends OceanAnimal {
        @Override
        Swimmable getCurrentAnimal() {
            return this;
        }
    }

    static class Otter implements Swimmable, Walkable {

        @Override
        public void walk() {

        }

        @Override
        public void swim() {

        }
    }
}
