package ru.mirea.task3;

public class Head {
    private String hair_color;
    private String eyes_color;
    private boolean isHaving_beard;

    public Head(){

    }

    public Head(String hair_color, String eyes_color, boolean isHaving_beard){
        this.isHaving_beard=isHaving_beard;
        this.eyes_color=eyes_color;
        this.hair_color=hair_color;
    }

    public String getHair_color() {
        return hair_color;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    public String getEyes_color() {
        return eyes_color;
    }

    public void setEyes_color(String eyes_color) {
        this.eyes_color = eyes_color;
    }

    public boolean isHaving_beard() {
        return isHaving_beard;
    }

    public void setHaving_beard(boolean having_beard) {
        this.isHaving_beard=having_beard;
    }

    @Override
    public String toString() {
        return  "Цвет волос: " + hair_color + "\n" +
                "Цвет глаз: " + eyes_color
                ;
    }
}