package ru.mirea.task29;

import java.io.*;

public class Task29 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Currency obj1, obj2;
        obj1 = new Currency("Euro", 65.53);

        System.out.println("Сериализация\n"+obj1.toString());
        FileOutputStream outputStream = new FileOutputStream("src\\ru\\mirea\\task29\\task29ser.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(obj1);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("src\\ru\\mirea\\task29\\task29ser.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        obj2 = (Currency) objectInputStream.readObject();
        System.out.println("Дессериализация\n" + obj2.toString());
    }
}