package com.javarush.task.task14.task1408;

public class RussianHen extends Hen implements Country {
    @Override
    int getCountOfEggsPerMonth() {
        return 1;
    }

    @Override
    public String getDescription() {
        String country = Country.RUSSIA;
        String str = super.getDescription() + " Моя страна - "
                + country
                + ". Я несу "
                + this.getCountOfEggsPerMonth()
                + " яиц в месяц.";
        return str;
    }
}
