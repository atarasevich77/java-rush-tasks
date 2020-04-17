package com.javarush.task.task14.task1408;

public class RussianHen extends Hen implements Country {

    private String COUNTRY = Country.RUSSIA;

    @Override
    int getCountOfEggsPerMonth() {
        return 1;
    }

    @Override
    public String getDescription() {
        String str = super.getDescription() + " Моя страна - "
                + COUNTRY
                + ". Я несу "
                + this.getCountOfEggsPerMonth()
                + " яиц в месяц.";
        return str;
    }
}
