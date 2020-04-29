package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }
    /**
     * При сравнении двух пляжей выдавал число,
     * которое показывает что первый пляж лучше (положительное число)
     * или второй пляж лучше (отрицательное число), и насколько он лучше.
    */
    @Override
    public synchronized int compareTo(Beach beach) {
        return (int) ((getQuality() - getDistance()) - (beach.getQuality() - beach.getDistance()));
    }

    public static void main(String[] args) {

    }
}
