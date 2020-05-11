package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader nameReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(nameReader.readLine()));
        nameReader.close();

        StringBuilder stringBuilder = new StringBuilder();

        while (fileReader.ready()) {
            stringBuilder.append(fileReader.readLine());
        }
        fileReader.close();

        String text = String.valueOf(stringBuilder);                     // Строка, с которой работаем
        String openTag = "<" + args[0], closeTag = "</" + args[0] + ">"; // Для удобства, сохраняем теги в переменные

        LinkedList<Integer> queue = new LinkedList<>();                  // Очередь для ожидающих закрытия тегов, запоминаем все открытые
        LinkedList<String> tempQueue = new LinkedList<>();               // Очередь для ожидающих вывода строк (очередь-2)

        for (int i = 0; i <= text.length() - closeTag.length(); i++){    // Проходим по тексту
            if (text.substring(i).startsWith(openTag)) {
                queue.addFirst(i);             // Записываем индекс открывающегося тега в очередь первым элементом
            }

            if (text.substring(i).startsWith(closeTag)){                              // Если встретили закрывающися тег, то:
                tempQueue.add(text.substring(queue.removeFirst(), i + closeTag.length()));      // Берем из очереди последний открывающийся тег и заносим в очередь-2

                if (queue.isEmpty()) {
                    while (!tempQueue.isEmpty()) {
                        System.out.println(tempQueue.removeLast()); // Если в очереди тегов закончилисm открывающиеся, начинаем выводить на печать из очереди-2
                    }
                }
            }
        }
    }
}
