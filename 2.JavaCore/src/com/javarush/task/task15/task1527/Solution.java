package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
Считать с консоли URL-ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк
Обрати внимание на то, что метод alert необходимо вызывать ПОСЛЕ вывода списка всех параметров на экран.

Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double: 3.14

1. Программа должна считывать с клавиатуры только одну строку.
2. Класс Solution не должен содержать статические поля.
3. Программа должна выводить данные на экран в соответствии с условием.
4. Программа должна вызывать метод alert с параметром double в случае,
если значение параметра obj может быть корректно преобразовано в число типа double.
5. Программа должна вызывать метод alert с параметром String в случае,
если значение параметра obj НЕ может быть корректно преобразовано в число типа double.
*/

import java.io.*;
import java.net.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        //add your code here
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String str = reader.readLine();
//            String str = "http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo";
            URL url = new URL(str);
            Map<String, String> pairs = new LinkedHashMap<>();
            String[] params = url.getQuery().split("&");
            for (String param: params){
                int idx = param.indexOf("=");
                String key = (idx > 0) ? param.substring(0, idx) : param;
                String value  = (idx > 0 && param.length() > idx + 1) ? param.substring(idx + 1) : null;
                pairs.put(key, value);
            }
            pairs.forEach(
                    (k, v) -> System.out.print(k + " ")
            );
            System.out.println();
            for (Map.Entry<String, String> pair: pairs.entrySet()) {
                if(pair.getKey().equals("obj")){
                    try{
                        alert(Double.parseDouble(pair.getValue()));
//                        double num = Double.parseDouble(pair.getValue());
//                        if(pair.getValue().contains(".")){
//                            alert(num);
//                        } else {
//                            alert(pair.getValue());
//                        }
                    } catch(Exception e){
                        alert(pair.getValue());
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
