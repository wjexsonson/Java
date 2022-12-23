package ru.mirea.task29;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class Currency implements Serializable {
    @Serial
    private static final long serialVersionUID=1L;
    Date date;
    String currency_name;
    double value;

    public Currency (String currency_name, double value) {
        this.date = new Date();
        this.currency_name = currency_name;
        this.value=value;
    }

    @Override
    public String toString() {
        return "CurrencyInfo{" +
                "date=" + date +
                ", currency_name='" + currency_name + '\'' +
                ", value=" + value +
                '}';
    }
}