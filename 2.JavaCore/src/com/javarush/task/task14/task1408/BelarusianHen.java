package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen implements Country {

    private String COUNTRY = Country.BELARUS;

    @Override
    int getCountOfEggsPerMonth() {
        return 10;
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
