package ru.mirea.task3;

import java.util.Scanner;

public class BookTest {

    public static int InputInt(){
        int n;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.print("Введите положительное число: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Введите положительное число! ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0);
        return n;
    }

    public static void BookInfo(Book book, int current_year){
        Scanner scanner=new Scanner(System.in);
        String answer;
        System.out.print("Желаете вывести информацию о созданном человека (Да/Нет): ");
        answer = scanner.next();
        if (answer.equals("Да") || answer.equals("да") || answer.equals("ДА")){
            System.out.println("Информация о книге");
            System.out.print(book.toString()+"\n"+"Возраст книги: " + book.BookAge(current_year));
        }
    }

    public static void CreateBook(){
        int current_year=2022;
        int pages, year;
        String name, genre, author, publishing_house;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите название книги: ");
        name=scanner.next();
        System.out.print("Введите жанр книги: ");
        genre=scanner.next();
        System.out.print("Введите автора книги: ");
        scanner.nextLine();
        author=scanner.nextLine();
        System.out.print("Введите издательство книги: ");
        publishing_house= scanner.nextLine();
        System.out.println("Введите год написания книги");
        year=InputInt();
        System.out.println("Введите кол-во страниц в книге");
        pages=InputInt();
        Book book=new Book(pages, year, name, genre, author, publishing_house);
        BookInfo(book, current_year);
    }

    public static void main(String[] args){
        CreateBook();
    }
}