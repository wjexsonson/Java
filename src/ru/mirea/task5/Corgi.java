package ru.mirea.task5;

public class Corgi extends Dog{
    public Corgi(){

    }

    public Corgi(String name, String color, double weight, double height){
        this.name=name;
        this.color=color;
        this.weight=weight;
        this.height=height;
    }

    public String Bark(){
        return "I'm Corgi, my name is "+ getName() +" WOF WOF!";
    }

    public String DogInfo() {
        return "Порода: Корги\nИмя: "+ getName()+"\nЦвет: "+getColor()+"\nВес: "+getWeight()+"\nРост: "+getHeight();
    }

}