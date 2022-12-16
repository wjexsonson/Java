package ru.mirea.task14;

import java.util.LinkedList;

public class Player {
    LinkedList<Card> hand = new LinkedList<Card>();
    String name;

    public Player(String name) {
        this.name = name;
    }

    public void addCard(Card card) {
        hand.addLast(card);
    }

    public void addCard(Card card1, Card card2) {
        hand.addLast(card1);
        hand.addLast(card2);
    }

    public Card toReveal() {
        return hand.pollFirst();
    }

    public void clearHand() {
        if (hand.size()!=0) {
            hand.clear();
        }
    }

    public boolean isEmpty() {
        return hand.isEmpty();
    }

    @Override
    public String toString() {
        return "Player{" +
                "hand=" + hand.toString() +
                ", name='" + name + '\'' +
                '}';
    }
}