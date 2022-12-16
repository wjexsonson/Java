package ru.mirea.task1;
/*Разработайте программу, которая будет с помощью метода вычислять
факториал числа (используйте управляющую конструкцию цикла), проверьте работу метода.*/
import java.util.Scanner;
public class Task_1_7 {
    public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.print("Введите число, факториал которого считать: ");
        number=scanner.nextInt();
        System.out.println("Результат = " + factorial(number));
    }
}