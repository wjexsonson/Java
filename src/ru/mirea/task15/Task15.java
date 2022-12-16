package ru.mirea.task15;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task15 {
    public static int InputMenu() {
        int menu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания:");
        System.out.println("1 - Реализовать запись в файл введённой с клавиатуры информации");
        System.out.println("2 - Реализовать вывод информации из файла на экран");
        System.out.println("3 - Заменить информацию в файле на информацию, введённую с клавиатуры.");
        System.out.println("4 - Добавить в конец исходного файла текст, введённый с клавиатуры.");
        System.out.println("0 - Выход из программы");
        while (true) {
            System.out.print("Введите число от 0 до 4: ");
            if (scanner.hasNextInt()) {
                menu = scanner.nextInt();
                if (menu >= 0 && menu <= 4) {
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
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String file_name = "src/ru/mirea/task15/data.txt";
        int menu;
        while (true){
            menu = InputMenu();
            if (menu == 0) {
                System.out.println("Задание не выбрано\nВыход из программы...");
                break;
            }
            switch (menu){
                case 1:{
                    try (FileWriter writer = new FileWriter(file_name, true)){
                        System.out.println("Введите данные, которые нужно записать:");
                        ArrayList<String> list = new ArrayList();
                        String data = scanner.nextLine();
                        while(!data.equals("")){
                            list.add(data);
                            data = scanner.nextLine();
                        }
                        for (int i = 0; i < list.size(); i++){
                            writer.write(list.get(i)+"\n");
                        }
                        writer.flush();
                    }
                    catch(IOException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                }
                case 2:{
                    try (FileReader reader = new FileReader(file_name)){
                        int c;
                        System.out.println("Данные, находящиеся в файле:");
                        while((c=reader.read())!=-1){
                            System.out.print((char)c);
                        }
                    }
                    catch(IOException ex){
                        System.out.println(ex.getMessage());
                    }
                    System.out.println();
                    break;
                }
                case 3:{
                    try (FileWriter writer = new FileWriter(file_name, false)){
                        System.out.println("Введите новые данные, которые нужно записать:");
                        ArrayList<String> list = new ArrayList();
                        String data = scanner.nextLine();
                        while(!data.equals("")){
                            list.add(data);
                            data = scanner.nextLine();
                        }
                        for (int i = 0; i < list.size(); i++) {
                            writer.write(list.get(i) + "\n");
                        }
                        writer.flush();
                    }
                    catch(IOException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                }
                case 4:{
                    try (FileWriter writer = new FileWriter(file_name, true)){
                        System.out.println("Введите данные, которые нужно записать в конец в файла:");
                        ArrayList<String> list = new ArrayList();
                        String data = scanner.nextLine();
                        while(!data.equals("")){
                            list.add(data);
                            data = scanner.nextLine();
                        }
                        for (int i = 0; i < list.size(); i++){
                            writer.append(list.get(i)+"\n");
                        }
                        writer.flush();
                    }
                    catch(IOException ex){
                        System.out.println(ex.getMessage());
                    }
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