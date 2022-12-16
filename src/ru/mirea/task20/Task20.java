package ru.mirea.task20;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task20 {

    public static void DateTask() {
        Scanner scanner = new Scanner(System.in);
        int year, month, date, hours, min;
        System.out.println("Работа с классом Date: ");
        System.out.print("Введите год: ");
        year=scanner.nextInt();
        System.out.print("Введите месяц: ");
        month=scanner.nextInt();
        System.out.print("Введите дату: ");
        date=scanner.nextInt();
        System.out.print("Введите час: ");
        hours =scanner.nextInt();
        System.out.print("Введите минуты: ");
        min =scanner.nextInt();
        Date user_date = new Date(year-1901, month, date, hours, min);
        System.out.println(user_date);
        System.out.println("------------------------------------");
        System.out.println("Год: " + user_date.getYear());
        System.out.println("Месяц: " + user_date.getMonth());
        System.out.println("Число: " + user_date.getDate());
        System.out.println("Часы: " + user_date.getHours());
        System.out.println("Минуты: " + user_date.getMinutes());
        System.out.println("------------------------------------");
    }

    public static void CalendarTask() {
        Scanner scanner = new Scanner(System.in);
        GregorianCalendar calendar = new GregorianCalendar();
        int year, month, date, hours, min;
        System.out.println("Работа с классом Calendar: ");
        System.out.print("Введите год: ");
        year=scanner.nextInt();
        System.out.print("Введите месяц: ");
        month=scanner.nextInt();
        System.out.print("Введите дату: ");
        date=scanner.nextInt();
        System.out.print("Введите час: ");
        hours =scanner.nextInt();
        System.out.print("Введите минуты: ");
        min =scanner.nextInt();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DATE, date);
        calendar.set(Calendar.HOUR, hours);
        calendar.set(Calendar.MINUTE, min);
        System.out.println("------------------------------------");
        System.out.println("Год: " + calendar.get(Calendar.YEAR));
        System.out.println("Месяц: " + calendar.get(Calendar.MONTH));
        System.out.println("Число: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Часы: " + calendar.get(Calendar.HOUR));
        System.out.println("Минуты: " + calendar.get(Calendar.MINUTE));
        System.out.println("------------------------------------");
    }

    public static void Task2() {
        System.out.println("Второе упражнение");
        System.out.println("------------------------------------");
        System.out.println("Фамилия разработчика: Дамарад");
        Date start_time = new Date();
        start_time.setDate(14);
        start_time.setMonth(11);
        start_time.setHours(17);
        start_time.setMinutes(50);
        System.out.println("Задание получено: " + start_time.getDate() + "." + start_time.getMonth() + " " + start_time.getHours() + ":" + start_time.getMinutes());
        System.out.println("Задание сдано:    " + new Date().getDate() + "." + new Date().getMonth() + " " + new Date().getHours() + ":" + new Date().getMinutes());
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        DateTask();
        CalendarTask();
        Task2();
    }
}