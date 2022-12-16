package ru.mirea.task26;

public class CreditPayment extends Payment{
    public CreditPayment() {
        this.paymentStrategy=new CreditPaymentStrategy();
    }
}