package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen implements Country {

    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    public String getDescription() {
        String country = Country.BELARUS;
        String str = super.getDescription() + " Моя страна - "
                + country
                + ". Я несу "
                + this.getCountOfEggsPerMonth()
                + " яиц в месяц.";
        return str;
    }
}
