package ru.mirea.task5;

import java.util.Scanner;

public class Plate extends Dish {
    private int diameter;

    public Plate(){

    }

    public Plate(String color, int diameter){
        this.color=color;
        this.diameter = diameter;
    }

    public void setClean(){
        Scanner scanner=new Scanner(System.in);
        String answer;
        System.out.print("Тарелка чистая? (да/нет): ");
        answer=scanner.next();
        if (answer.equals("Да") || answer.equals("да") || answer.equals("ДА")){
            this.isClean=true;
        }
        else {
            this.isClean=false;
        }
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String Info() {
        return "Тарелка: \n" + "Цвет: " + getColor() +"\nДиаметр: "+getDiameter()+"\nСостояние: " + getClean() + "\n";
    }

}