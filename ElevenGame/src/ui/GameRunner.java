package ui;

import sodomka.Card;
import sodomka.Deck;

/**
 * Runs GUI or ConsolaUI
 */
public class GameRunner {
    
    public static void main(String[] args) {

        Card[] deck = Deck.generateDeck();
        
        for (int i = 0; i < deck.length; i++) {
            deck[i].toString();
            System.out.println(deck[i]);
        }
    }
}
