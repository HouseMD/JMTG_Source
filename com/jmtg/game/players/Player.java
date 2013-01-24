package com.jmtg.game.players;

import com.jmtg.game.Game;
import com.jmtg.game.cards.Card;
import com.jmtg.game.decks.Deck;
import com.jmtg.game.players.hands.Hand;

public class Player {

	protected Deck deck;
	protected Hand hand = new Hand();
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
		Game.hand.addCard(drew);
		this.hand.add(drew);
		this.deck.removeCard(drew);
		System.out.println("Drew: " + drew.getName());
		System.out.println("Cards Left: " + deck.getCards().size());
	}

	public void playCard(Card card) {
		this.hand.removeCard(card);
		System.out.println("Played: " + card.getName());
	}

}
