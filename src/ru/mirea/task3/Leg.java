package ru.mirea.task3;

public class Leg {
    private int toes;
    public Leg(){

    }
    public Leg(int toes){
        this.toes=toes;
    }

    public int getToes() {
        return toes;
    }

    public void setToes(int toes) {
        this.toes = toes;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "toes=" + toes +
                '}';
    }
}