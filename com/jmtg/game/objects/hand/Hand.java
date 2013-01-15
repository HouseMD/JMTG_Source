package com.jmtg.game.objects.hand;

import java.util.ArrayList;

import com.jmtg.game.objects.cards.Card;

public class Hand extends ArrayList<Card> {

	private static final long serialVersionUID = 1L;

	public Hand(Card... cards) {
		for (Card card : cards) {
			this.add(card);
		}
	}

	public ArrayList<Card> getCards() {
		return this;
	}

	public void addCard(Card card) {
		this.add(card);
	}

	public void removeCard(Card card) {
		if (this.contains(card))
			this.remove(card);
	}

}
