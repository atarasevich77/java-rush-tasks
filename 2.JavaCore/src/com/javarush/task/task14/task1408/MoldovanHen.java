package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen implements Country {

    private String COUNTRY = Country.MOLDOVA;

    @Override
    int getCountOfEggsPerMonth() {
        return 9;
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
