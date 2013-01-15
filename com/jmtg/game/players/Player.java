package com.jmtg.game.players;

import com.jmtg.game.objects.cards.Card;
import com.jmtg.game.objects.decks.Deck;
import com.jmtg.game.objects.hand.Hand;

public class Player {

	protected Deck deck;
	protected Hand hand = new Hand();;
	protected String name;

	public Player(String name_) {
		if (this.deck == null) {
		}
	}

	public String getName() {
		return this.name;
	}

	public Hand getHand() {
		return this.hand;
	}

	public Deck getDeck() {
		return this.deck;
	}

	public void drawCard() {
		Card drew = deck.getCard(0);
		this.hand.add(drew);
		this.deck.removeCard(drew);
	}
	
	public void playCard(Card card) {
		this.hand.removeCard(card);
		System.out.println("Played: " + card.getName());
	}

}
