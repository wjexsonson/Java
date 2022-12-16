package ru.mirea.task5;

public class Bulldog extends Dog{

    public Bulldog(){

    }

    public Bulldog(String name, String color, double weight, double height){
        this.name=name;
        this.color=color;
        this.weight=weight;
        this.height=height;
    }

    public String Bark(){
        return "I'm Bulldog, my name is "+ getName() +" WOF WOF!";
    }

    public String DogInfo() {
        return "Порода: Бульдог\nИмя: "+ getName()+"\nЦвет: "+getColor()+"\nВес: "+getWeight()+"\nРост: "+getHeight();
    }
}