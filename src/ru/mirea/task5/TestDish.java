package ru.mirea.task5;

import java.util.Scanner;

public class TestDish {
    public static void main(String[] args){
        String spoon_color, plate_color, spoon_type;
        int plate_diameter;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Цвет ложки: ");
        spoon_color=scanner.next();
        System.out.print("Тип ложки: ");
        spoon_type=scanner.next();
        Spoon spoon=new Spoon(spoon_color,spoon_type);
        spoon.setClean();
        System.out.print("Цвет тарелки: ");
        plate_color=scanner.next();
        System.out.print("Диаметр тарелки: ");
        plate_diameter= scanner.nextInt();
        Plate plate =new Plate(plate_color, plate_diameter);
        plate.setClean();
        System.out.print("\n"+spoon.Info()+"\n"+plate.Info());
    }
}