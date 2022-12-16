package ru.mirea.task14;

public class Card {
    int value;

    public Card(int value) {
        this.value = value;
    }

    static public int compareCards(Card card1, Card card2) {
        if ((card1.value==0 || card1.value==9) && (card2.value==0 || card2.value==9)) {
            if (card1.value==0 && card2.value==9) {
                return 1;
            }
            else if (card1.value==9 && card2.value==0) {
                return -1;
            }
            else {
                return 0;
            }
        }
        else {
            if (card1.value > card2.value) {
                return 1;
            }
            else if (card1.value < card2.value) {
                return -1;
            }
            else {
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                '}';
    }
}