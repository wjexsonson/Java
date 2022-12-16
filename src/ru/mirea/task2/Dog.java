package ru.mirea.task2;

public class Dog {
    private String name;
    private int age;
    public Dog(){

    }
    public Dog(int age, String name){
        this.age=age;
        this.name=name;
    }
    public int ToHumanAge(int age) {
        return age*7;
    }
    public String ToString(){
        return "Имя: " + name +"\nВозраст: " +age+ "\n";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}