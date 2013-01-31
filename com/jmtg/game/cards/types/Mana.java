package com.jmtg.game.cards.types;

import com.jmtg.game.cards.Card;
import com.jmtg.game.cards.CardData;
import com.jmtg.game.cards.CardType;
import com.jmtg.game.graphics.panels.gameboard.BoardCard;
import com.jmtg.game.util.RotatedIcon;

public class Mana extends Card {

	public Mana(CardData card) {
		super(card);
		type = CardType.MANA;
	}

	public void tap(BoardCard boardCard) {
		if (boardCard.getIcon().getIconHeight() > boardCard.getIcon().getIconWidth()) {
			RotatedIcon ri = new RotatedIcon(boardCard.card.getIcon(4), RotatedIcon.Rotate.DOWN);
			boardCard.setIcon(ri);
		} else if (boardCard.getIcon().getIconHeight() < boardCard.getIcon().getIconWidth()) {
			boardCard.setIcon(boardCard.card.getIcon(4));
		}
	}
}
