package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution extends Thread {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        T1 t1 = new T1(); threads.add(t1);
        T2 t2 = new T2(); threads.add(t2);
        T3 t3 = new T3(); threads.add(t3);
        T4 t4 = new T4(); threads.add(t4);
        T5 t5 = new T5(); threads.add(t5);
    }

    public static void main(String[] args) {
//        threads.forEach(v-> v.start());
    }

    public static class T1 extends Thread{
        @Override
        public void run() {
            while(true){
            }
        }
    }
    public static class T2 extends Thread{
        @Override
        public void run() {
            try{
                throw new InterruptedException();
            } catch(InterruptedException e){
                System.out.println("InterruptedException");
            }
        }
    }
    public static class T3 extends Thread{
        @Override
        public void run() {
            while(true){
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
    public static class T4 extends Thread implements Message{
        private boolean isCancel = false;
        @Override
        public void run() {
            while(!this.isCancel) {
            }
        }
        @Override
        public void showWarning() {
            if(Thread.currentThread().isAlive()){
                this.isCancel = true;
            }
        }
    }
    public static class T5 extends Thread{
        @Override
        public void run() {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String str;
                int num = 0;
                while (!(str = reader.readLine()).equals("N")){
                    num += Integer.parseInt(str);
                }
                System.out.println(num);
            } catch (Exception e) {
            }
        }
    }
}