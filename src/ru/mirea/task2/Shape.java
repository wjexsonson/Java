package ru.mirea.task2;

public class Shape {
    public int x, y;
    public Shape(){

    }
    public Shape(int x, int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "Информация об объекте\n"+"X="+x+"\nY="+y;
    }
}