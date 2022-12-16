package ru.mirea.task5;

import java.util.Scanner;

public class Chair extends Furniture{

    public Chair(){

    }

    public Chair(int price, String color, boolean availability){
        this.price=price;
        this.color=color;
        this.availability=availability;
    }

    public Chair(int price, String color){
        this.price=price;
        this.color=color;
        this.setAvailability();
    }

    public void setAvailability() {
        Scanner scanner=new Scanner(System.in);
        String answer;
        System.out.print("Кресло есть в наличии? (да/нет): ");
        answer=scanner.next();
        if (answer.equals("Да") || answer.equals("да") || answer.equals("ДА")){
            this.availability=true;
        }
        else {
            this.availability=false;
        }
    }

    public String Info(){
        return "Кресло:\nЦвет: "+ getColor()+"\nЦена: "+getPrice()+" рублей\nНаличие в магазине: "+getAvailability();
    }

}