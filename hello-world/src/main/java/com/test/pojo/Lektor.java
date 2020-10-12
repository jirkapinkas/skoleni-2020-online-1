package com.test.pojo;

public class Lektor extends Clovek {

    private int pocetLetZkusenosti;

    public Lektor(int vyska, String jmeno, int pocetLetZkusenosti) {
        super(vyska, jmeno);
        this.pocetLetZkusenosti = pocetLetZkusenosti;
    }

    @Override
    public String getType() {
//        return "LEKTOR";
//        return "CLOVEK:LEKTOR";
        return super.getType() + ":LEKTOR";
    }

    public int getPocetLetZkusenosti() {
        return pocetLetZkusenosti;
    }

    public void setPocetLetZkusenosti(int pocetLetZkusenosti) {
        this.pocetLetZkusenosti = pocetLetZkusenosti;
    }
}
