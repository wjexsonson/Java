package ru.mirea.task23;

import java.util.Objects;

class Car{
    private String brand;
    private String model;
    private int manufactureYear;
    private int dollarPrice;

    public Car(String brand, String model, int manufactureYear, int dollarPrice) {
        this.brand=brand;
        this.model=model;
        this.manufactureYear=manufactureYear;
        this.dollarPrice=dollarPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car that = (Car) o;
        if (manufactureYear != that.manufactureYear) return false;
        if (dollarPrice != that.dollarPrice) return false;
        return model.equals(that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, manufactureYear, dollarPrice);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", manufactureYear=" + manufactureYear +
                ", dollarPrice=" + dollarPrice +
                ", hash=" + hashCode() +
                '}';
    }
}

class Audi extends Car{
    public Audi(String brand, String model, int manufactureYear, int dollarPrice) {
        super(brand, model, manufactureYear, dollarPrice);
    }
}

class Nissan extends Car{
    public Nissan(String brand, String model, int manufactureYear, int dollarPrice) {
        super(brand, model, manufactureYear, dollarPrice);
    }
}

class Toyota extends Car{
    public Toyota(String brand, String model, int manufactureYear, int dollarPrice) {
        super(brand, model, manufactureYear, dollarPrice);
    }
}

public class Task23 {

    public static void compareCars(Car car1, Car car2) {
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        if (car1.hashCode()==car2.hashCode() && car1.equals(car2)) {
            System.out.println("Объекты равны");
        }
        else {
            System.out.println("Объекты не равны");
        }
        System.out.println("---------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Car car1, car2, car3, car4 ,car5;
        car1=new Audi("Audi", "RS6", 2021, 200000);
        car2=new Nissan("Nissan", "Skyline", 1999, 50000);
        car3=new Audi("Audi", "RS6", 2021, 200000);
        car4 =new Toyota("Toyota", "Supra", 1998, 75000);
        car5=new Toyota("Toyota", "Camry", 2020, 50000);

        compareCars(car1, car2);
        compareCars(car1, car3);
        compareCars(car1, car4);
        compareCars(car1, car5);

        compareCars(car2, car3);
        compareCars(car2, car4);
        compareCars(car2, car5);

        compareCars(car3, car4);
        compareCars(car3, car5);

        compareCars(car4, car5);

    }
}