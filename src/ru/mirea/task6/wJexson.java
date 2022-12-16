package ru.mirea.task6;

public class wJexson implements Nameable {

    @Override
    public String getName() {
        return "Hello, my name is wJexson!";
    }

    public static void main(String[] args) {
        wJexson wjex=new wJexson();
        System.out.print(wjex.getName());
    }

}