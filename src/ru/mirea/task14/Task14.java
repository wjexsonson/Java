package ru.mirea.task14;

import java.util.Random;
import java.util.Stack;


public class Task14 {

    static Player first = new Player("first");
    static Player second = new Player("second");
    static int turns = 0;

    public static void main(String[] args) {
        newGameStack();
        while (turns < 106) {
            Card firstCard = first.toReveal();
            Card secondCard = second.toReveal();
            if (Card.compareCards(firstCard, secondCard) == 1) {
                first.addCard(firstCard, secondCard);
            }
            else {
                second.addCard(secondCard, firstCard);
            }
            if (first.isEmpty()) {
                System.out.println("second " + (turns + 1));
                break;
            }
            if (second.isEmpty()) {
                System.out.println("first " + (turns + 1));
                break;
            }
            ++turns;
        }
        if (turns == 106) {
            System.out.println("botva");
        }

    }

    static void newGameStack() {
        turns=0;
        first.clearHand();
        second.clearHand();
        Random rand = new Random();
        Stack<Card> cards = new Stack<>();
        for (int i=0; i<10; i++) {
            cards.add(new Card(i));
        }

        Player current = first;
        for (int i = 0; i < 10; i++) {
            Card card = cards.get(rand.nextInt(cards.size()));
            cards.remove(card);
            current.addCard(card);
            if (current==first) {
                current=second;
            }
            else {
                current=first;
            }
        }

        System.out.print("Первый игрок: ");
        System.out.println(first.toString());
        System.out.print("Второй игрок: ");
        System.out.println(second.toString());
        System.out.println("Игра началась");
    }

}
