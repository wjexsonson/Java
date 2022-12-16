package ru.mirea.task1;
/*Разработайте программу, в результате работы которой считается
сумма элементов целочисленного массива с помощью циклов
`for`, `while`, `do while`, результат выводится на экран.*/
import java.util.Scanner;
public class Task_1_3  {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int size, cycle, result=0;
        System.out.print("Введите размер массива: ");
        size=scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Заполнение массива");
        for (int i=0; i<size; i++){
            System.out.print("Введите " + (i+1) + " элемент массива: ");
            arr[i]=scanner.nextInt();
        }
        System.out.println("Выберите цикл, с помощью которого считать сумму массива");
        System.out.println("1 - for\n2 - while\n3 - do while");
        cycle= scanner.nextInt();
        switch(cycle) {
            case 1:
                System.out.println("Выбран цикл for");
                for (int i=0; i<size; i++){
                    result+=arr[i];
                }
                System.out.print("Результат = " + result);
                break;
            case 2:
                System.out.println("Выбран цикл while");
                int i=0;
                while(i<size){
                    result+=arr[i];
                    i++;
                }
                System.out.print("Результат = " + result);
                break;
            case 3:
                System.out.println("Выбран цикл do-while");
                int j=0;
                do {
                    result+=arr[j];
                    j++;
                }while(j<size);
                System.out.print("Результат = " + result);
                break;
            default:
                System.out.println("Цикл не выбран");
                break;
        }
    }
}