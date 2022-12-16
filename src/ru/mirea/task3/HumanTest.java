package ru.mirea.task3;
import java.util.Scanner;
public class HumanTest {
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

    public static void HumanInfo(Human human){
        Scanner scanner=new Scanner(System.in);
        String answer;
        System.out.print("Желаете вывести информацию о созданном человека (Да/Нет): ");
        answer = scanner.next();
        if (answer.equals("Да") || answer.equals("да") || answer.equals("ДА")){
            System.out.println("Информация о созданном человеке");
            System.out.print(human.toString()+"\n"+human.head.toString());
            if(human.head.isHaving_beard() && (human.getGender().equals("М") || human.getGender().equals("м"))){
                System.out.print("\nБорода: присутвует");
            }
            else if (!human.head.isHaving_beard() && (human.getGender().equals("М") || human.getGender().equals("м"))){
                System.out.print("\nБорода: отсутсвует");
            }
        }
    }
    public static void CreateHuman(){
        System.out.println("Создание человека");
        Scanner scanner=new Scanner(System.in);
        String gender, name, surname;
        int age, weight, height;
        System.out.print("Введите пол человека (М/Ж): ");
        gender=scanner.next();
        System.out.print("Введите имя человека: ");
        name=scanner.next();
        System.out.print("Введите фамилию человека: ");
        surname=scanner.next();
        System.out.println("Ввод возраста человека");
        age=InputInt();
        System.out.println("Ввод веса человека: ");
        weight=InputInt();
        System.out.println("Ввод роста человека: ");
        height=InputInt();
        Human human=new Human(gender, name, surname, weight, height, age);
        String eyes_color, hair_color;
        System.out.print("Введите цвет глаз у созданного человека: ");
        eyes_color=scanner.next();
        human.head.setEyes_color(eyes_color);
        System.out.print("Введите цвет волос у созданного человека: ");
        hair_color=scanner.next();
        human.head.setHair_color(hair_color);
        String answer;
        if (human.getGender().equals("М") || human.getGender().equals("м")) {
            System.out.print("У созданного человека есть борода (Да/Нет): ");
            answer = scanner.next();
            if (answer.equals("Да") || answer.equals("да") || answer.equals("ДА")) {
                human.head.setHaving_beard(true);
            }
        }
        HumanInfo(human);
    }

    public static void main(String[] args){
        CreateHuman();
    }
}