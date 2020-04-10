package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();


        int[] arr = new int[]{a,b,c,d};
        Arrays.sort(arr);
        for(int i = arr.length-1 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }


    }
}
