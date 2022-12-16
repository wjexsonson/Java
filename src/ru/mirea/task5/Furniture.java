package ru.mirea.task5;

public abstract class Furniture {
    protected int price;
    protected String color;
    protected boolean availability=true;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getAvailability(){
        if (availability){
            return "да";
        }
        else {
            return "нет";
        }
    }

    public abstract void setAvailability();
    public abstract String Info();
}