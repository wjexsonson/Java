package ru.mirea.task2;
import java.util.ArrayList;
import java.util.Scanner;
public class TestDog {
    public static void AddDog(ArrayList<Dog> dogs, String name, int age){
        dogs.add(new Dog(age, name));
    }
    public static void ShowDogs(ArrayList<Dog> dogs){
        for(int i=0;i<dogs.size();i++){
            System.out.print("Собака №"+(i+1)+"\n"+dogs.get(i).ToString());
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int amount, age;
        String name;
        System.out.print("Введите кол-во собак собак: ");
        amount=scanner.nextInt();
        ArrayList<Dog> dogs=new ArrayList<>();
        for (int i=0;i<amount;i++){
            System.out.print("Введите имя "+(i+1)+" собаки: ");
            name=scanner.next();
            System.out.print("Введите возраст "+(i+1)+" собаки: ");
            age=scanner.nextInt();
            AddDog(dogs, name, age);
        }
        ShowDogs(dogs);
    }
}