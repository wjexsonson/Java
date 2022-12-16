package ru.mirea.task5;

public abstract class Dish {
    protected boolean isClean=true;
    protected String color;

    public Dish(){

    }

    public Dish(String color){
        this.color=color;
    }

    public abstract void setClean();

    public String getClean(){
        if (isClean){
            return "чистая";
        }
        else {
            return "грязная";
        }
    }

    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }

    public abstract String Info();
}