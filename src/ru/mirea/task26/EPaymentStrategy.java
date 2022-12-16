package ru.mirea.task26;

import java.util.Scanner;

public class EPaymentStrategy implements PaymentStrategy{
    @Override
    public void askData() {
        System.out.println("Введите данные электронного кашелька");
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.print("Введите номер кошелька: ");
        number=sc.nextInt();
        System.out.println("Введеите \"ПОДТВЕРДИТЬ\", чтобы подтвердить покупку");
        String agreement = sc.next();
        if (agreement.equals("ПОДТВЕРДИТЬ")){
            System.out.println("Заказ оформлен. Благодарим за покупку");
        }
        else {
            System.out.println("Оплата не подтверждена.");
        }
    }
}