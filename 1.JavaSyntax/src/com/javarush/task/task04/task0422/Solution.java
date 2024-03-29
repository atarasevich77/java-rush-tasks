package com.javarush.task.task04.task0422;

/* 
18+
1. Программа должна дважды считать данные c клавиатуры.
2. Программа должна использовать команду System.out.println() или System.out.print().
3. Если возраст меньше 18 вывести только сообщение "Подрасти еще".
4. Если возраст больше либо равно 18 ничего не выводить.
*/

import java.util.Scanner;

public class Solution {

    static void validateAge(int age) throws ValidateAgeException {
        if(age < 18){
            throw new ValidateAgeException("Подрасти еще");
        }
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
//        if(age < 18){
//            System.out.println("Подрасти еще");
//        }

        try {
            validateAge(age);
        } catch (ValidateAgeException e) {
            e.printStackTrace();
        }
    }
}

class ValidateAgeException extends Exception{
    public ValidateAgeException(String msg){
        super(msg);
    }
}