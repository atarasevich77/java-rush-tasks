package com.javarush.task.task04.task0412;
import java.util.Scanner;
/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        if(a > 0){
           a = a*2; 
        } else if(a < 0){
            a = a+1;
        } else {
            a = 0;
        }
        System.out.println(a);
    }

}