package ru.mirea.task5;

public class FurnitureShop {
    public static void main(String[] args){
        Sofa sofa = new Sofa(40000, "Бежевый", true);
        Chair chair = new Chair(15000, "Коричневый", false);
        System.out.println("\nИнформация о товарах в магазине");
        System.out.print("\n"+sofa.Info()+"\n\n"+chair.Info()+"\n");
    }
}