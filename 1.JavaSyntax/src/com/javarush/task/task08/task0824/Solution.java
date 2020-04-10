package com.javarush.task.task08.task0824;

/* 
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).

1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось:
два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human son1 = new Human("Shultz Hitler", true, 21, new ArrayList<>());
        Human son2 = new Human("Fric Hitler", true, 18, new ArrayList<>());
        Human daughter = new Human("Dora Hitler", false, 16, new ArrayList<>());
        ArrayList<Human> children = new ArrayList<>();
        children.add(son1);children.add(son2);children.add(daughter);

        Human father = new Human("Adam Hitler", true, 45, children);
        Human mother = new Human("Sara Hitler", false, 43, children);

        ArrayList<Human> children2 = new ArrayList<>();
        children2.add(father);
        ArrayList<Human> children3 = new ArrayList<>();
        children3.add(mother);

        Human ded1 = new Human("Adolf Hitler", true, 65, children2);
        Human ded2 = new Human("Karl Bismark", true, 70, children3);
        Human baba1 = new Human("Eva Hitler", false, 66, children2);
        Human baba2 = new Human("Margaret Bismark", false, 69, children3);

        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(baba1.toString());
        System.out.println(baba2.toString());

        System.out.println(father.toString());
        System.out.println(mother.toString());

        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(daughter.toString());

    }

    public static class Human {
        String name;
         boolean sex;
         int age;
         ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
