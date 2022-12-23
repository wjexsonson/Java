package ru.mirea.task28;

public class Automobile {
    public String brand, model, type;
    private final Wheels wheels=new Wheels("Toyo");

    public Automobile() { }

    Automobile(String brand, String model){
        this.brand=brand;
        this.model=model;
    }

    Automobile(String brand, String model, String type){
        this.brand=brand;
        this.model=model;
        this.type=type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void engineSound(){
        System.out.println("Звук двигателя");
    }

    private class Wheels { //Вложенный внутренний класс
        private String manufacturer;

        private Wheels(String manufacturer){
            this.manufacturer=manufacturer;
        }

        @Override
        public String toString() {
            return "Wheels{" +
                    "manufacturer='" + manufacturer + '\'' +
                    '}';
        }
    }

    public static class Sedan extends Automobile { //Вложенный статический класс
        Sedan(String brand, String model) {
            super(brand, model);
            setType("Sedan");
        }
    }

    public class F1Car extends Automobile { //Вложенный класс

        F1Car(String brand, String model) {
            super(brand, model);
            setType("F1");
        }

        public void engineSound(){
            System.out.println("Громкий звук двигателя");
        }
    }

    public static void main(String[] args) {

        Automobile sedan=new Sedan("Renault", "Logan");
        Automobile notAnonF1Car=new Automobile().new F1Car("Ferrari", "430");
        Automobile anonF1Car=new Automobile("Lancia", "Stratos", "F1") { //Анонимный класс
            public void engineSound() {
                System.out.println("Громкий звук двигателя");
            }
        };
        System.out.println(sedan.toString());
        sedan.engineSound();
        System.out.println(anonF1Car.toString());
        anonF1Car.engineSound();
        System.out.println(notAnonF1Car.toString());
        notAnonF1Car.engineSound();
    }
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", " + wheels.toString() +
                '}';
    }
}