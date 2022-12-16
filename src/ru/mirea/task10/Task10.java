package ru.mirea.task10;

import java.util.Scanner;

public class Task10 {

    public static int InputMenu(){
        int menu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВАРИАНТ №6\nВведите номер задания:\n1) Проверка числа на простоту.\n2) Разложение на множители.\n3) Палиндром.\n4) Без двух нулей.\n5) Разворот числа.\n0) Выход из программы");
        while(true){
            System.out.print("Введите число от 0 до 5: ");
            if (scanner.hasNextInt()){
                menu=scanner.nextInt();
                if (menu>=0 && menu<6){
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

    public static int InputInt() {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите натуральное число: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Введите натуральное число! ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0 );
        return n;
    }

    static boolean simple(int digit) {
        if (digit == 1) {
            return true;
        }
        return simple(digit, digit - 1);
    }

    public static boolean simple(int digit, int div) {
        if (div == 1) {
            return true;
        }
        if (digit % div == 0) {
            return false;
        } else {
            return simple(digit, div - 1);
        }
    }

    public static void multipliers(int digit){
        int temp = digit;
        String multipliers="Все простые множители числа "+digit+" в порядке неубывания с учетом кратности: ";
        for (int i=2; i<=digit; i++){
            while(temp%i==0 && simple(i)){
                temp/=i;
                multipliers+=Integer.toString(i)+" ";
            }
        }
        System.out.println(multipliers);
    }

    public static String palindrome(String str){
        if (str.charAt(0)==str.charAt(str.length()-1)){
            return palindrome(str,1);
        }
        else {
            return "NO";
        }
    }

    public static String palindrome(String str, int i){
        if (i>str.length()/2) {
            return "YES";
        }
        if (str.charAt(i)==str.charAt(str.length()-1-i)) {
            return palindrome(str, ++i);
        }
        else {
            return "NO";
        }
    }

    static int Without_two_zeros(int a,int b){
        if (a-1>b) {
            return 0;
        }
        if (a==0 || b==0) {
            return 1;
        }
        return Without_two_zeros(a,b-1)+Without_two_zeros(a-1,b-1);
    }

    public static int Reverse_number(int number, int length){
        if (number > 10){
            int result = Reverse_number(number / 10, length - 1);
            result += (number % 10)*Math.pow(10., length);
            return result;
        }
        else {
            return number;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        while (true) {
            menu=InputMenu();
            if (menu==0) {
                System.out.println("Задание не выбрано\nВыход из программы...");
                break;
            }
            switch (menu) {
                case 1: {
                    int number;
                    System.out.println("Введите число, которое хотите проверить на простоту");
                    number = InputInt();
                    if (simple(number)) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                    break;
                }
                case 2: {
                    int number;
                    System.out.println("Введите число, которое хотите разложить на множители");
                    number = InputInt();
                    multipliers(number);
                    break;
                }
                case 3: {
                    String str;
                    System.out.println("Введите слово, которое хотите проверить на палиндром");
                    str=scanner.nextLine();
                    System.out.println(palindrome(str));
                    break;
                }
                case 4: {
                    int a, b;
                    System.out.println("Введите число a");
                    a=InputInt();
                    System.out.println("Введите число b");
                    b=InputInt();
                    System.out.println("Кол-во последовательностей из a нулей и b единиц, в которых никакие два нуля не стоят рядом = " + Without_two_zeros(a,b));
                    break;
                }
                case 5: {
                    int number;
                    System.out.println("Введите число, которое хотите развернуть");
                    number=InputInt();
                    int length = (int) (Math.log10(number) + 1) - 1;
                    System.out.println("Развернутое число "+number+" = "+Reverse_number(number,length));
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