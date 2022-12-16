package ru.mirea.task22;

class Client  {
    public void Sit(Chair chair){
        System.out.println("Клиент сел на " + chair.getName());
    }
}

public class Task22 {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();
        Chair chair = chairFactory.createChair(Chairs.MAGIC_CHAIR);
        Client client = new Client();
        client.Sit(chair);
    }
}