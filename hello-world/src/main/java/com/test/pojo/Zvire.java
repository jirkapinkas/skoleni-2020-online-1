package com.test.pojo;

public abstract class Zvire {

    public Zvire(int vyska) {
        this.vyska = vyska;
    }

    private int vyska;

    private boolean alive;

    public int getVyska() {
        return vyska;
    }

    public void setVyska(int vyska) {
        this.vyska = vyska;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public abstract String getType();
}
