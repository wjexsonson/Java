package ru.mirea.task3;

public class Hand {
    public int fingers;

    public Hand(){

    }

    public Hand(int fingers){
        this.fingers=fingers;
    }
    public int getFingers() {
        return fingers;
    }

    public void setFingers(int fingers) {
        this.fingers = fingers;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "fingers=" + fingers +
                '}';
    }
}