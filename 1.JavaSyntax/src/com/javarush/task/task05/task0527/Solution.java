package com.javarush.task.task05.task0527;

/* 
Том и Джерри
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.

Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.


1. Создай класс Dog.
2. Создай класс Cat.
3. В классе Dog должно быть три переменные.
4. В классе Cat должно быть три переменные.
5. Должен быть создан хотя бы один объект типа Mouse.
6. Должен быть создан хотя бы один объект типа Dog.
7. Должен быть создан хотя бы один объект типа Cat.
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        //напишите тут ваш код
        Cat tomCat = new Cat("Tom", "blue", 7);
        Dog pitDog = new Dog("Pit", "buldog", 100);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog
    {
        private  String name;
        private String kind;
        private int strength;

        public Dog(String name, String kind, int strength) {
            this.name = name;
            this.kind = kind;
            this.strength = strength;
        }
    }

    public static class Cat
    {
        private  String name;
        private String color;
        private int strength;

        public Cat(String name, String color, int strength) {
            this.name = name;
            this.color = color;
            this.strength = strength;
        }
    }
    //напишите тут ваш код
}
