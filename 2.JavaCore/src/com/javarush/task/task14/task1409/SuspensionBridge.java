package com.javarush.task.task14.task1409;

public class SuspensionBridge implements Bridge {

    private int COUNT_SUSPENSION = 1;

    @Override
    public int getCarsCount() {
        return this.COUNT_SUSPENSION;
    }
}
