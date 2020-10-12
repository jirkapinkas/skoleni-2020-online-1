package com.test.pojo;

public class Clovek {

    private String jmeno;

    private int vyska;

    public String getClovekTxt() {
        return "Jmeno: " + jmeno + ", Vyska: " + vyska + " cm";
    }

    // alt + insert

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getVyska() {
        return vyska;
    }

    public void setVyska(int vyska) {
        this.vyska = vyska;
    }
}
