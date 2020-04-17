package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen implements Country {

    @Override
    int getCountOfEggsPerMonth() {
        return 9;
    }

    @Override
    public String getDescription() {
        String country = Country.MOLDOVA;
        String str = super.getDescription() + " Моя страна - "
                + country
                + ". Я несу "
                + this.getCountOfEggsPerMonth()
                + " яиц в месяц.";
        return str;
    }
}
