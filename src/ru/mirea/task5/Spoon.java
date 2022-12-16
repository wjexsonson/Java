package ru.mirea.task5;
import java.util.Scanner;
public class Spoon extends Dish {

    private String type;

    public Spoon(){

    }

    public Spoon(String color, String type){
        this.color=color;
        this.type=type;
    }

    public void setClean(){
        Scanner scanner=new Scanner(System.in);
        String answer;
        System.out.print("Ложка чистая? (да/нет): ");
        answer=scanner.next();
        if (answer.equals("Да") || answer.equals("да") || answer.equals("ДА")){
            this.isClean=true;
        }
        else {
            this.isClean=false;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String Info() {
        return "Ложка: \n" + "Цвет: " + getColor()+"\nТип: " + getType() +"\nСостояние: " + getClean() + "\n";
    }

}