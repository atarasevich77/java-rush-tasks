package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen implements Country {
    @Override
    int getCountOfEggsPerMonth() {
        return 15;
    }

    @Override
    public String getDescription() {
        String country = Country.UKRAINE;
        String str = super.getDescription() + " Моя страна - "
                + country
                + ". Я несу "
                + this.getCountOfEggsPerMonth()
                + " яиц в месяц.";
        return str;
    }
}
