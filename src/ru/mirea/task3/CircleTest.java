package ru.mirea.task3;
import java.util.Scanner;
public class CircleTest {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int r;
        do {
            System.out.print("Введите радиус окружности (положительное число): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Введите положительное число! ");
                scanner.next();
            }
            r = scanner.nextInt();
        } while (r <= 0);
        Circle circle=new Circle(r);
        System.out.print(circle.toString()+"\nПериметр = " + circle.Perimeter(r)+"\nПлощадь = "+circle.Square(r));
    }
}