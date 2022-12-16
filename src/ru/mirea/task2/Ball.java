package ru.mirea.task2;

public class Ball {
    private float weight, diametr, air_pressure;
    private int x, y;
    public Ball(){

    }
    public Ball(float weight, float diametr, float air_pressure, int x, int y){
        this.weight=weight;
        this.diametr=diametr;
        this.air_pressure=air_pressure;
        this.x=x;
        this.y=y;
    }
    public void Move(int x, int y){
        this.x+=x;
        this.y+=y;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getDiametr() {
        return diametr;
    }

    public void setDiametr(float diametr) {
        this.diametr = diametr;
    }

    public float getAir_pressure() {
        return air_pressure;
    }

    public void setAir_pressure(float air_pressure) {
        this.air_pressure = air_pressure;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}