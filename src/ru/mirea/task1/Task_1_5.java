package ru.mirea.task1;
/*Разработайте программу, в результате работы которой выводятся
на экран первые 10 чисел гармонического ряда (форматируйте вывод).*/
public class Task_1_5 {
    public static void main(String[] args){
        System.out.print("Первые 10 чисел гармонического ряда: ");
        for(int i=1; i<=10;i++){
            System.out.printf("1/"+i+" ");
        }
    }
}