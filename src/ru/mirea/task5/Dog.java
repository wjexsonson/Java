package ru.mirea.task5;

public abstract class Dog {
    protected double height, weight;
    protected String name, color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String Bark();
    public abstract String DogInfo();
}