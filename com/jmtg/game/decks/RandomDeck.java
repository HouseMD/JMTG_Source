package com.jmtg.game.decks;

import java.util.ArrayList;
import java.util.Random;

import com.jmtg.game.cards.Card;

public class RandomDeck extends Deck {

	static Random generator = new Random();

	public RandomDeck(String name_, ArrayList<Card> cards_) {
		super(name_, cards_);
		cards = Randomize();
		System.out.println("Deck Final Size: " + cards.size());
	} 

	public ArrayList<Card> Randomize() {
		int startSize = this.getSize();
		ArrayList<Card> cardsLeft = cards;
		ArrayList<Card> finalDeck = new ArrayList<Card>();

		for (int i = 0; i < startSize; i++) {
			Card seslected = cardsLeft.get(generator.nextInt(cardsLeft.size()));
			finalDeck.add(seslected);
			cardsLeft.remove(seslected);
		}
		return finalDeck;
	}

}
