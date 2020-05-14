package com.javarush.task.task20.task2027;

import java.util.*;

/* 
Кроссворд
*/
public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        System.out.println(detectAllWords(crossword, "home", "same"));
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }
    private static boolean ok(int x, int y, int[][] crossword) {
        return 0 <= x && x < crossword.length && 0 <= y && y < crossword[x].length;
    }
    private static void go(int startX, int startY, int x, int y, int dx, int dy, StringBuilder curr, int[][] crossword,
                           HashMap<String, int[]> wordsToDetect, HashSet<String> prefixes) {
//        System.err.println(String.format("go from (%d %d) to (%d %d)", startX, startY, x, y));
        curr.append((char)crossword[x][y]);
        String str = curr.toString();
        if (prefixes.contains(str)) {
            if (wordsToDetect.containsKey(str) && wordsToDetect.get(str)[0] == -1) {
                wordsToDetect.put(str, new int[]{startX, startY, x, y});
            }
            if (ok(x + dx, y + dy, crossword)) {
                go(startX, startY, x + dx, y + dy, dx, dy, curr, crossword, wordsToDetect, prefixes);
            }
        }
        curr.setLength(curr.length() - 1);
    }
    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        HashMap<String, int[]> wordsToDetect = new HashMap<>();
        HashSet<String>prefixes = new HashSet<>();
        for (String word : words) {
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < word.length(); ++i) {
                str.append(word.charAt(i));
                prefixes.add(str.toString());
            }
            wordsToDetect.put(word, new int[]{-1, -1, -1, -1});
        }
        int[][] delta = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, 1}, {-1, -1}, {1, -1}, {-1, 1}};
        for (int i = 0; i < crossword.length; ++i) {
            for (int j = 0; j < crossword[i].length; ++j) {
                for (int[] d : delta) {
                    go(i, j, i, j, d[0], d[1], new StringBuilder(), crossword, wordsToDetect, prefixes);
                }
            }
        }
        List<Word> ans = new ArrayList<>();
        wordsToDetect.forEach((k, v) -> {
            Word word = new Word(k);
            word.setStartPoint(v[1], v[0]);
            word.setEndPoint(v[3], v[2]);
            ans.add(word);
        });
        return ans;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
