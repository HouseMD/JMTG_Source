package com.jmtg.game.graphics.panels.gameboard;

import javax.swing.JLabel;

import com.jmtg.game.cards.Card;
import com.jmtg.game.cards.CardType;
import com.jmtg.game.players.Side;

public class BoardCard extends JLabel{
	
	private static final long serialVersionUID = 1L;
	
	Card card;
	Side side;
	CardType type;
	
	public BoardCard(Card card, Side side) {
		this.card = card;
		this.side = side;
		this.type = card.getType();
	}
	
	public Card getCard() {
		return this.card;
	}
	
}
