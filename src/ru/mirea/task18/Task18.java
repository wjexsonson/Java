package ru.mirea.task18;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        String FIO, INN;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        FIO = scanner.nextLine();
        System.out.print("Введите номер ИНН: ");
        INN = scanner.next();
        try {
            Integer.parseInt(INN);
            // Integer.parseInt() Разбирает строковый аргумент в виде десятичного целого числа со знаком
            // и генерирует исключение NumberFormatException, если строка не может быть преобразована в тип int.
        }
        catch (NumberFormatException e){
            System.out.println("Ошибка, введен недействительный ИНН: " + e.getMessage());
        }
    }
}