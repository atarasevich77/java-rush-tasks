package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина

1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address

1. В классе Solution создай public static класс Man.
2. В классе Solution создай public static класс Woman.
3. Класс Man должен содержать переменные: name(String), age(int) и address(String).
4. Класс Woman должен содержать переменные: name(String), age(int) и address(String).
5. У классов Man и Woman должны быть конструкторы, принимающие параметры с типами String, int и String.
6. Конструкторы должны инициализировать переменные класса.
7. В методе main необходимо создать по два объекта каждого типа.
8. Метод main должен выводить созданные объекты на экран в указанном формате.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("fff", 121, "sdsd223");
        Man man2 = new Man("fff2", 12, "sdsd232");
        Woman  woman1 = new Woman("aaa", 123, "sdsd43434");
        Woman  woman2 = new Woman("aaa2", 112, "sdsd656");
        man1.print();
        man2.print();
        woman1.print();
        woman2.print();

    }

    //напишите тут ваш код
    public static  class Man {
        private String name;
        private int age;
        private String address;
        public Man() {}
        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void print() {
            System.out.println(name + " " + age + " " + address);
        }
    }

    public static  class Woman {
        private String name;
        private int age;
        private String address;
        public Woman() {}
        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void print() {
            System.out.println(name + " " + age + " " + address);
        }
    }
}
