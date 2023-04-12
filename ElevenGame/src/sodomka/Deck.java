/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sodomka;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hsodo
 */
public class Deck {
    private static Card [] deck = new Card [52];;
    
    public static Card[] generateDeck(){
        String Number = "";
        String Symbol = "";
        int cardNumber = 0;
        for (int value = 1; value <= 13; value++) {
            switch(value){
                case 1: Number = "A"; break;
                case 11: Number = "J"; break;
                case 12: Number = "Q"; break ;
                case 13: Number = "K"; break;
                default: Number = Integer.toString(value);
            }
            Symbol = "♥";
            deck[cardNumber] = new Card (Number, Symbol, value);
            cardNumber++;
            
            Symbol = "♠";
            deck[cardNumber] = new Card (Number, Symbol, value);
            cardNumber++;
            
            Symbol = "♣";
            deck[cardNumber] = new Card (Number, Symbol, value);
            cardNumber++;
                    
            Symbol = "♦";
            deck[cardNumber] = new Card (Number, Symbol, value);
            cardNumber++;
            
        }
        return deck;
    }
    
    
}
