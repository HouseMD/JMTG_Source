package com.jmtg.game.cards.types;

import com.jmtg.game.cards.Card;
import com.jmtg.game.cards.CardData;
import com.jmtg.game.cards.CardType;

public class Enchantment extends Card{
	
	public Enchantment(CardData card) {
		super(card);
		type = CardType.ENCHANTMENT;
	}

}
