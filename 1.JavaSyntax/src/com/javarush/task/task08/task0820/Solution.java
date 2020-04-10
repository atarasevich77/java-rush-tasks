package com.javarush.task.task08.task0820;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog без конструктора или с конструктором без параметров.
2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки.

1. Программа должна выводить текст на экран.
2. Внутри класса Solution должны быть созданы public static классы Cat, Dog.
3. Метод createCats() класса Solution должен возвращать множество (Set) содержащее 4 кота.
4. Метод createDogs() класса Solution должен возвращать множество (Set) содержащее 3 собаки.
5. Метод join() класса Solution должен возвращать объединенное множество всех животных - всех котов и собак.
6. Метод removeCats() должен удалять из множества pets всех котов, которые есть в множестве cats.
7. Метод printPets() должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<Cat>();
        //напишите тут ваш код
        Cat cat1 = new Cat(); cat1.name = "c1";
        Cat cat2 = new Cat(); cat2.name = "c2";
        Cat cat3 = new Cat(); cat3.name = "c3";
        Cat cat4 = new Cat(); cat4.name = "c4";
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        return cats;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> dogs = new HashSet<>();
        Dog dog1 = new Dog(); dog1.name = "d1";
        Dog dog2 = new Dog(); dog2.name = "d2";
        Dog dog3 = new Dog(); dog3.name = "d3";
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeIf(x->cats.contains(x));
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        pets.forEach(System.out::println);
    }

    public static class Cat {
        private String name;
    }

    public static class Dog {
        private String name;
    }
}
