package com.javarush.task.task16.task1627;

import java.util.ArrayList;
import java.util.List;
/*1. Метод run класса Gamer через равные интервалы времени (1000ms / rating) должен выводить в консоль фамилию игрока (метод getName()),
потом двоеточие, а затем текст из OnlineGame.steps. Пример: Ivanov:Начало игры
2. Когда все игровые шаги будут выполнены, а победитель еще не найден, метод run должен установить флаг OnlineGame.isWinnerFound в true
(сообщить остальным, что он победитель).
3. Если игрок стал победителем, его метод run должен вывести надпись getName() + ":победитель!". Например: Sidorov:победитель!
4. Методы run всех игроков которые не стали победителями (были прерваны), должны вывести надписи getName() + ":проиграл".
Например: Petrov:проиграл
5. Метод run не должен кидать исключение при прерывании.*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {
        public static volatile boolean isWinnerFound = false;

        public static List<String> steps = new ArrayList<String>();

        static {
            steps.add("Начало игры");
            steps.add("Сбор ресурсов");
            steps.add("Рост экономики");
            steps.add("Убийство врагов");
        }

        protected Gamer gamer1 = new Gamer("Ivanov", 3);
        protected Gamer gamer2 = new Gamer("Petrov", 1);
        protected Gamer gamer3 = new Gamer("Sidorov", 5);
        protected Gamer gamer4 = new Gamer("Vasechkin", 5);

        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start(); gamer4.start();

            while (!isWinnerFound) {
            }
            gamer1.interrupt();
            gamer2.interrupt();
            gamer3.interrupt();
            gamer4.interrupt();
        }
    }

    public static class Gamer extends Thread {
        private int rating;

        public Gamer(String name, int rating) {
            super(name);
            this.rating = rating;
        }

        @Override
        public void run() {
            //Add your code here - добавь код тут
            try{
                for (String step: OnlineGame.steps) {
                    Thread.sleep(1000 / rating);
                    System.out.println(getName() + ":" + step);
                }
                if(!OnlineGame.isWinnerFound){
                    System.out.println(getName() + ":победитель!");
                    OnlineGame.isWinnerFound = true;
                }
            } catch(Exception e){
                System.out.println(getName() + ":проиграл");
            }
        }
    }
}
