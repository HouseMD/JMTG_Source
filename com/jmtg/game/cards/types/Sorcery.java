package com.jmtg.game.cards.types;

import com.jmtg.game.cards.Card;
import com.jmtg.game.cards.CardData;
import com.jmtg.game.cards.CardType;

public class Sorcery extends Card {

	public Sorcery(CardData card) {
		super(card);
		type = CardType.SORCERY;
	}
}
