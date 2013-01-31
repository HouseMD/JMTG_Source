package com.jmtg.game.cards.types;

import com.jmtg.game.cards.Card;
import com.jmtg.game.cards.CardData;
import com.jmtg.game.cards.CardType;
import com.jmtg.game.graphics.panels.gameboard.BoardCard;
import com.jmtg.game.util.RotatedIcon;

public class Creature extends Card {

	public int attack;
	public int toughness;

	public Creature(CardData card) {
		super(card);
		type = CardType.CREATURE;
		attack = card.attack;
		toughness = card.toughness;
	}

	public void addAttack(int amount) {
		this.attack += amount;
	}

	public void addToughness(int amount) {
		this.toughness += amount;
	}

	public void tap(BoardCard boardCard) {
		if (boardCard.getIcon().getIconHeight() > boardCard.getIcon().getIconWidth()) {
			RotatedIcon ri = new RotatedIcon(boardCard.card.getIcon(4), RotatedIcon.Rotate.DOWN);
			boardCard.setIcon(ri);
			boardCard.setBounds(boardCard.getX(), boardCard.getY(), ri.getIconWidth(), ri.getIconHeight());
		} else if (boardCard.getIcon().getIconHeight() < boardCard.getIcon().getIconWidth()) {
			boardCard.setIcon(boardCard.card.getIcon(4));
			boardCard.setBounds(boardCard.getX(), boardCard.getY(), boardCard.getIcon().getIconWidth(), boardCard.getIcon().getIconHeight());
		}
	}
}
