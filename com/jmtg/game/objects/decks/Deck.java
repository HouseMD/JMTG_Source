package com.jmtg.game.objects.decks;

import java.util.ArrayList;

import com.jmtg.game.objects.cards.Card;

public class Deck {

	private ArrayList<Card> cards = new ArrayList<Card>();
	private String name;
	private int size;

	public Deck(String name_, ArrayList<Card> cards_) {
		this.name = name_;
		this.cards = cards_;
		this.size = this.cards.size();
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
		return this.size;
	}

}
