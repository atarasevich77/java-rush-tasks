package com.javarush.task.task15.task1501;

/* 
ООП - Расставить интерфейсы
1. Класс Clothes должен поддерживать интерфейс Movable.
2. Класс Clothes должен поддерживать интерфейс Sellable.
3. Класс Clothes должен поддерживать интерфейс Discountable.
4. В классе Clothes должен быть реализован метод isMovable.
5. В классе Clothes должен быть реализован метод getAllowedAction без параметров.
6. В классе Clothes должен быть реализован метод getAllowedAction с одним параметром типа String.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Discountable, Movable, Sellable {
        @Override
        public boolean isMovable() {
            return false;
        }

        @Override
        public Object getAllowedAction() {
            return null;
        }

        @Override
        public Object getAllowedAction(String name) {
            return null;
        }
    }
}
