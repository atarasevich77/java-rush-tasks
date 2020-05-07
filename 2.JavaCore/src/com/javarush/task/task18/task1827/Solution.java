package com.javarush.task.task18.task1827;

/* 
Прайсы
где id - 8 символов.
productName - название товара, 30 символов.
price - цена, 8 символов.
quantity - количество, 4 символа.
-c - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно,

-c productName price quantity
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234

1. Программа должна считать имя файла для операций CrUD с консоли.
2. В классе Solution не должны быть использованы статические переменные.
3. При запуске программы без параметров список товаров должен остаться неизменным.
4. При запуске программы с параметрами "-c productName price quantity" в конец файла должна добавится новая строка с товаром.
5. Товар должен иметь следующий id, после максимального, найденного в файле.
6. Форматирование новой строки товара должно четко совпадать с указанным в задании.
7. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
//        String fileName = "C:\\Users\\vika\\Downloads\\files_for_tests\\2.txt";
        if (args.length == 0) return;

        BufferedReader fReader = new BufferedReader(new FileReader(fileName));

        String line;
        List<Integer> ids = new ArrayList<>();
        while (null != (line = fReader.readLine())) {
            ids.add(Integer.parseInt(line.substring(0, 8).trim()));
        }
        fReader.close();

        int maxId = Collections.max(ids);

        if (args[0].equals("-c")) {
            if (args.length != 4) return;

            String id = String.format("\n%-8d", ++maxId);
            String productName = String.format("%-30.30s", args[1]);
            String price = String.format(Locale.ROOT, "%-8.2f", Double.parseDouble(args[2]));
            String quantity = String.format("%-4d", Integer.parseInt(args[3]));

            String newProduct = id + productName + price + quantity;

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write(newProduct);
            writer.close();
        }
    }
}
