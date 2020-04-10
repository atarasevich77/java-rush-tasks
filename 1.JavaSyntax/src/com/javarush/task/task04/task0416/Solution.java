package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
в начале каждого часа в течение трех минут горит зелёный сигнал,
затем в течение одной минуты - жёлтый,
а потом в течение одной минуты - красный,
затем опять зелёный горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        double t = sc.nextFloat();

        double green = 3;
        double yellow = 4;
        double red = 5;

        double module = t % 5;

        if(module < green){
            System.out.println("зеленый");
        } else if (module < yellow){
            System.out.println("желтый");
        } else if (module < red) {
            System.out.println("красный");
        }
    }
}