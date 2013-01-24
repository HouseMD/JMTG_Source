package com.jmtg.game.cards.types;

import com.jmtg.game.cards.Card;
import com.jmtg.game.cards.CardData;
import com.jmtg.game.cards.CardType;

public class Artifact extends Card{
	
	public Artifact(CardData card) {
		super(card);
		type = CardType.ARTIFACT;
	}

}
