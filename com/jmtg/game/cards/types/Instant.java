package com.jmtg.game.cards.types;

import com.jmtg.game.cards.Card;
import com.jmtg.game.cards.CardData;
import com.jmtg.game.cards.CardType;

public class Instant extends Card {

	public Instant(CardData card) {
		super(card);
		type = CardType.INSTANT;
	}
}
