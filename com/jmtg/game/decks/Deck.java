package com.jmtg.game.decks;

import java.util.ArrayList;

import com.jmtg.game.cards.Card;

public class Deck {
	protected String name;
	protected ArrayList<Card> cards = new ArrayList<Card>();

	public Deck(String name_, ArrayList<Card> cards_) {
		this.name = name_;
		cards = cards_;
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void addCard(Card card) {
		cards.add(card);
	}

	public void removeCard(Card card) {
		cards.remove(card);
	}

	public Card getCard(int i) {
		return cards.get(i);
	}

	public String getName() {
		return this.name;
	}

	public int getSize() {
		return cards.size();
	}

	public ArrayList<String> cardNames() {
		ArrayList<String> names = new ArrayList<String>();
		for (Card card : this.getCards()) {
			names.add(card.getName());
		}
		return names;
	}

}
