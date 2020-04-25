package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
1. Метод run класса RacingClock должен содержать цикл.
2. Объект класса RacingClock должен каждую секунду уменьшать значение переменной numSeconds на единицу.
3. Метод main должен вызывать Thread.sleep(3500).
4. Метод main должен вызывать метод interrupt у объекта clock.
5. Если numSeconds равно 3, то программа должна вывести "3 2 1 Марш!".
6. Если numSeconds равно 4, то программа должна вывести "4 3 2 1 Прервано!".
*/

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            try {
                while (!this.isInterrupted()) {
                    System.out.print(Solution.numSeconds + " ");
                    Thread.sleep(1000);
                    Solution.numSeconds--;
                    if(Solution.numSeconds == 0){
                        System.out.println("Марш!");
                        break;
                    }
                }
            } catch (InterruptedException e){
                System.out.println("Прервано!");
            }
        }
    }
}

