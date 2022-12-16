package ru.mirea.task26;

public class Payment {
    PaymentStrategy paymentStrategy;

    public void askData(){
        paymentStrategy.askData();
    }
}