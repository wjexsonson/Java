package ru.mirea.task5;

import java.util.Scanner;

public class TestDog {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String corgi_name, corgi_color, bulldog_name, bulldog_color;
        double corgi_weight, corgi_height, bulldog_weight, bulldog_height;
        System.out.println("Создание собаки породы Корги");
        System.out.print("Имя собаки: "); corgi_name=scanner.next();
        System.out.print("Цвет собаки: "); corgi_color=scanner.next();
        System.out.print("Вес собаки: "); corgi_weight=scanner.nextDouble();
        System.out.print("Рост собаки: "); corgi_height=scanner.nextDouble();
        Corgi corgi=new Corgi(corgi_name, corgi_color, corgi_weight, corgi_height);
        System.out.println(corgi.Bark());

        System.out.println("Создание собаки породы Бульдог");
        System.out.print("Имя собаки: "); bulldog_name=scanner.next();
        System.out.print("Цвет собаки: "); bulldog_color=scanner.next();
        System.out.print("Вес собаки: "); bulldog_weight=scanner.nextDouble();
        System.out.print("Рост собаки: "); bulldog_height=scanner.nextDouble();
        Bulldog bulldog=new Bulldog(bulldog_name, bulldog_color, bulldog_weight, bulldog_height);
        System.out.println(bulldog.Bark());
        System.out.print("\nИнформация о созданных собаках\n\n"+corgi.DogInfo()+"\n\n"+bulldog.DogInfo()+"\n");

    }
}