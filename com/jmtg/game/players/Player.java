package com.jmtg.game.players;

import com.jmtg.game.Game;
import com.jmtg.game.cards.Card;
import com.jmtg.game.cards.CardData;
import com.jmtg.game.cards.types.Enchantment;
import com.jmtg.game.decks.Deck;
import com.jmtg.game.decks.RandomDeck;
import com.jmtg.game.players.hands.Hand;

public class Player {

	protected RandomDeck deck;
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
		Game.handPanel.addCard(drew);
		this.hand.add(drew);
		this.deck.removeCard(drew);
		System.out.println("Drew: " + drew.getName());
		System.out.println("Cards Left: " + deck.getCards().size());
	}

	public void playCard(Card card, Side side) {
		Game.handPanel.removeCard(card);
		Game.handPanel.repaint();
		Game.handPanel.revalidate();

		switch (card.getType()) {

		case MANA:
			Game.gameBoard.localSide.manaBoard.addCard(card);
			break;
		case ENCHANTMENT:
			Game.gameBoard.localSide.creatureBoard.attachEntchantment((Enchantment) card, Game.gameBoard.localSide.creatureBoard.getComponent(0));
			break;
		case CREATURE:
			Game.gameBoard.localSide.creatureBoard.addCard(card);
			break;
		default:
			break;
		}

		Game.gameBoard.localSide.manaBoard.repaint();
		Game.gameBoard.localSide.manaBoard.revalidate();
		Game.cardPanel.prev.setIcon(new Card(CardData.BACK).getIcon(1));
		System.out.println("Played: " + card.getName());
	}

}
