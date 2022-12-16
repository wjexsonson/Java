package ru.mirea.task4;

public class Ball {
    private double x=0.0, y=0.0;

    public Ball(){

    }

    public Ball(double x, double y){
        this.x = x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y=y;
    }

    public void move(double xDisp, double yDisp) {
        System.out.print("Ball moved from {x=" +x+", y="+y+"}");
        this.setXY(xDisp,yDisp);
        System.out.print(" to {x=" + x + ", y=" + y +"}\n");
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}