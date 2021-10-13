package com.bridgelabz.workshoptwo;

/**
 * Work shop on Deck of Cards Game
 *
 * @author : Anji Raj
 * @version : 16.0
 * @since : 13/10/2021
 *
 */

public class DeckOfCardsMain {
    public static void main(String[] args) {
        System.out.println("Welcome to deck of cards game");
        // create the object for PlayCards
        PlayCards cardsPlay = new PlayCards();
        // call to main method
        cardsPlay.uniqueCards();
    }
}
