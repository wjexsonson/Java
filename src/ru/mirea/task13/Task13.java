package ru.mirea.task13;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class Task13 {
    static class MyList<T> {
        private final int size;
        private int actual_size = 0;
        private final T[] array;

        public MyList(Class<T> c, int size){
            this.size = size;
            array = (T[]) Array.newInstance(c, size);
        }

        public T get(int index){
            return array[index];
        }

        public int size(){
            return actual_size;
        }

        public void add(T item){
            int i = 0;
            while (i < size && array[i] != null){
                ++i;
            }
            if (size == i){
                System.out.println("Not enough space");
                return;
            }
            actual_size = i;

            array[i] = item;
        }

        public void set(int index, T item){
            array[index] = item;
        }

        public void remove(T item){
            int i = 0;
            while (i < size && array[i] != item){
                ++i;
            }

            if (size == i) {
                System.out.println("Item not found");
                return;
            }

            if (size - 1 - i >= 0) System.arraycopy(array, i + 1, array, i, size - 1 - i);

            array[size - 1] = null;
            actual_size--;

        }

        @Override
        public String toString() {
            String out = "[" + array[0];
            for(int i=1; i<actual_size; i++){
                out+=", " + array[i];
            }
            out+="]";
            return out;
        }
    }
    public static int InputMenu() {
        int menu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания:\n1 - ArrayList\n2 - LinkedList\n3 - Свой ArrayList");
        while (true) {
            System.out.print("Введите число от 0 до 3: ");
            if (scanner.hasNextInt()) {
                menu = scanner.nextInt();
                if (menu >= 0 && menu <= 3) {
                    return menu;
                } else {
                    System.out.println("Число вне допустимого диапазона значений. Повторите ввод.");
                    scanner.next();
                }
            } else {
                System.out.println("Неверный ввод, повторите.");
                scanner.next();
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            int menu;
            menu = InputMenu();
            if (menu == 0) {
                System.out.println("Задание не выбрано\nВыход из программы...");
                break;
            }
            switch (menu) {
                case 1: {
                    ArrayList<Integer> arr = new ArrayList<Integer>();
                    for (int i=0; i<10; i++){
                        arr.add((int)(Math.random()*100));
                    }
                    System.out.println(arr.toString());
                    System.out.println("Элемент под индексом 1 = " + arr.get(1));
                    System.out.println("Длина коллекции = " + arr.size());
                    arr.set(5,10);
                    System.out.println("Замена 5-ого элемента на 10: " + arr.toString());
                    arr.remove(2);
                    System.out.println("Удаление 2-ого элемента: " + arr.toString());
                    arr.sort(new Comparator<Integer>() {
                        @Override
                        public int compare(Integer o1, Integer o2) {
                            return o1 - o2;
                        }
                    });
                    System.out.println("Сортировка: " + arr.toString());
                    break;
                }
                case 2: {
                    LinkedList<Integer> arr = new LinkedList<Integer>();
                    for(int i=0; i<10; i++){
                        arr.addFirst((int)(Math.random()*100));
                    }
                    System.out.println(arr.toString());
                    System.out.println("Длина коллекции = " + arr.size());
                    System.out.println("Элемент под индексом 3 = " + arr.get(3));
                    arr.set(1,25);
                    System.out.println("Изменение первого элемента на 25: " + arr.toString());
                    arr.remove(arr.indexOf(25));
                    System.out.println("Удаление элемента со значением 25: " + arr.toString());
                    arr.removeFirst();
                    arr.removeLast();
                    System.out.println("Удаление первого и последнего элементов: " + arr.toString());
                    break;
                }
                case 3:{
                    MyList<Integer> arr = new MyList<Integer>(Integer.class, 10);
                    for(int i=0; i<10; i++){
                        arr.add((int)(Math.random()*100));
                    }
                    System.out.println(arr.toString());
                    System.out.println("Значение 5-ого элемента = " + arr.get(5));
                    arr.set(3,77);
                    System.out.println("Установка 77 на место 3-его элемента: " + arr.toString());
                    arr.remove(77);
                    System.out.println("Удаление элемента со значением 77: " + arr.toString());
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