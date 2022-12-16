package ru.mirea.task1;
/*Разработайте программу, в результате работы которой выводятся
на экран аргументы командной строки в цикле `for`.*/
public class Task_1_4 {
    public static void main(String[] args){
        System.out.println("Aргументы командной строки");
        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
}