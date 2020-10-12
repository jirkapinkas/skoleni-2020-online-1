package com.test.pojo;

/**
 * Hello World trida Clovek
 */
public class Clovek extends Zvire {

    /**
     * Jmeno cloveka
     */
    private String jmeno;

    /**
     * Metoda co vrati jmeno a vysku cloveka v "cm"
     * @return Stuff
     */
    public String getClovekTxt() {
        return "Jmeno: " + jmeno + ", Vyska: " + getVyska() + " cm";
    }

    // alt + insert

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

}
