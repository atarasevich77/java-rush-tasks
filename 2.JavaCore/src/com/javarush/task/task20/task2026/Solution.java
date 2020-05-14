package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
        byte[][] b = a;
        int count = 0;

        for (int i = 0; i < b.length ; i++)
        {
            for (int j = 0; j < b[i].length ; j++)
            {
                if (b[i][j] == 1){
                    count++;
                    int horizon = 1;
                    while (j + horizon < b[i].length && b[i][j + horizon] == 1){
                        b[i][j + horizon] = 0;
                        horizon++;
                    }
                    int vertical = 1;
                    while (i + vertical < b.length && b[i + vertical][j] == 1){
                        b[i + vertical][j] = 0;
                        int horizonTmp = 1;
                        while (horizonTmp != horizon){
                            b[i + vertical][j + horizonTmp] = 0;
                            horizonTmp++;
                        }
                        vertical++;
                    }
                }
            }

        }
        return count;
    }
}
