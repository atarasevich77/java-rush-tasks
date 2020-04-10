package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(list);
        for(int v : list){
            System.out.println(v);
        }
    }
}
