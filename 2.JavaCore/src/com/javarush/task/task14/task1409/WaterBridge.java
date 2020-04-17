package com.javarush.task.task14.task1409;

public class WaterBridge implements Bridge {

    private int COUNT_WATER = 10;

    @Override
    public int getCarsCount() {
        return this.COUNT_WATER;
    }
}
