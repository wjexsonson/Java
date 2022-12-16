package ru.mirea.task12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Student{
    public int ID;
    Student(){
        ID=(int)(Math.random()*100);
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                '}';
    }

    public int getID() {
        return ID;
    }
}



public class Task12 {
    static void insertionSort(Student[] arr){
        for (int left = 0; left < arr.length; left++) {
            Student value = arr[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.ID < arr[i].ID) {
                    arr[i + 1] = arr[i];
                } else {
                    break;
                }
            }
            arr[i + 1] = value;
        }
    }

    static void quickSort(Student[] arr){
        Comparator<Student> comp = new SortingStudentsByGPA();
        Arrays.sort(arr, comp);
    }

    static void mergeSort(Student[] arr, int left, int right){
        if (right <= left)
            return;
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        Student[] buffer = Arrays.copyOf(arr, arr.length);

        for (int k = left; k <= right; k++)
            buffer[k] = arr[k];

        int i = left, j = mid + 1;
        for (int k = left; k <= right; k++) {
            if (i > mid) {
                arr[k] = buffer[j];
                j++;
            } else if (j > right) {
                arr[k] = buffer[i];
                i++;
            } else if (buffer[j].getID() < buffer[i].getID()) {
                arr[k] = buffer[j];
                j++;
            } else {
                arr[k] = buffer[i];
                i++;
            }
        }
    }

    public static int InputMenu(){
        int menu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер сортировки:\n1 - Cортировка вставками\n2 - Быстрая сортировка\n3 - Сортировка слиянием");
        while(true){
            System.out.print("Введите число от 0 до 3: ");
            if (scanner.hasNextInt()){
                menu=scanner.nextInt();
                if (menu>=0 && menu<=3){
                    return menu;
                }
                else {
                    System.out.println("Число вне допустимого диапазона значений. Повторите ввод.");
                    scanner.next();
                }
            }
            else {
                System.out.println("Неверный ввод, повторите.");
                scanner.next();
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            Student[] IDNumber = new Student[10];
            for (int i = 0; i < 10; i++) {
                IDNumber[i] = new Student();
            }
            int menu;
            menu = InputMenu();
            if (menu == 0) {
                System.out.println("Задание не выбрано\nВыход из программы...");
                break;
            }
            switch (menu){
                case 1:{
                    System.out.println("\nВыбрана сортировка вставками");
                    System.out.println("Иcходный массив: ");
                    System.out.println(Arrays.toString(IDNumber));
                    insertionSort(IDNumber);
                    System.out.println("Отсортированный массив: ");
                    System.out.println(Arrays.toString(IDNumber));
                    System.out.println();
                    break;
                }
                case 2:{
                    System.out.println("\nВыбрана быстрая сортировка");
                    System.out.println("Иcходный массив: ");
                    System.out.println(Arrays.toString(IDNumber));
                    quickSort(IDNumber);
                    System.out.println("Отсортированный массив: ");
                    System.out.println(Arrays.toString(IDNumber));
                    System.out.println();
                    break;
                }
                case 3:{
                    System.out.println("\nВыбрана сортировка слиянием");
                    System.out.println("Иcходный массив: ");
                    System.out.println(Arrays.toString(IDNumber));
                    System.out.println("Отсортированный массив: ");
                    mergeSort(IDNumber, 0, IDNumber.length-1);
                    System.out.println(Arrays.toString(IDNumber));
                    System.out.println();
                    break;
                }
                default:{
                    System.out.println("Задание не выбрано");
                    break;
                }
            }
        }
    }
}