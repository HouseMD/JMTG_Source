package com.jmtg.game.cards.types;

import com.jmtg.game.cards.Card;
import com.jmtg.game.cards.CardData;
import com.jmtg.game.cards.CardType;
import com.jmtg.game.cards.Abilities.InstantAbility;

public class Instant extends Card {
	
	private InstantAbility abilty;

	public Instant(CardData card) {
		super(card);
		type = CardType.INSTANT;
	}
}
