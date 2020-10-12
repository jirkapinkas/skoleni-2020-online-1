package com.test.pojo;

/**
 * Hello World trida Clovek
 */
public class Clovek {

    /**
     * Jmeno cloveka
     */
    private String jmeno;

    private int vyska;

    /**
     * Metoda co vrati jmeno a vysku cloveka v "cm"
     * @return Stuff
     */
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
