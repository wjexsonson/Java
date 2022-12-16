package ru.mirea.task3;

public class Circle {
    private int r;

    public Circle(){

    }

    public Circle(int r){
        this.r=r;
    }

    public double Square(int r){
        return 3.14*Math.pow(r,2);
    }

    public double Perimeter(int r){
        return 2*3.14*r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Окружность\n" +
                "Радиус = " + r
                ;
    }
}