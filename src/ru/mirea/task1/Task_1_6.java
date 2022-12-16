package ru.mirea.task1;
/*Разработайте программу, в результате работы которой генерируется
массив целых чисел случайным образом, выведите его на экран, отсортируйте, и снова
выведите на экран (используйте два подхода к генерации случайных чисел – метод
`random()` класса `Math` и класс `Random`).*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Task_1_6 {
    public static void fillarray(int[] arr){
        for (int i=0;i<arr.length;i++){
            arr[i] = (int) (Math.random() * 100);
        }
    }
    public static void fillarray2(int[] arr){
        Random random = new Random();
        for (int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(100);
        }
    }
    public static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int size, option;
        System.out.print("Введите размер массива: ");
        size=scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Выберите вариант заполнения массива");
        System.out.print("1 - метод `random()` класса `Math`\n2 - класс `Random`\n");
        option=scanner.nextInt();
        switch (option){
            case 1:
                fillarray(arr);
                System.out.print("Массив: ");
                printarray(arr);
                Arrays.sort(arr);
                System.out.print("\nОтсортированный массив: ");
                printarray(arr);
                break;
            case 2:
                fillarray2(arr);
                System.out.print("Массив: ");
                printarray(arr);
                Arrays.sort(arr);
                System.out.print("\nОтсортированный массив: ");
                printarray(arr);
                break;
            default:
                System.out.println("Вариант заполнения массива не выбран");
                break;
        }
    }
}