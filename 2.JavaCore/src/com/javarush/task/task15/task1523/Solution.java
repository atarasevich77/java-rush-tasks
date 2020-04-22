package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    private String str;
    private Integer in;
    private Double db;
    private Character ch;

    public Solution(String str) {
        this.str = str;
    }
    protected Solution(Integer in) {
        this.in = in;
    }
    private Solution(Double db) {
        this.db = db;
    }
    Solution(Character ch) {
        this.ch = ch;
    }

    public static void main(String[] args) {

    }
}

