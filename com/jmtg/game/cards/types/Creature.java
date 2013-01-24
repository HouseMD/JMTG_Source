package com.jmtg.game.cards.types;

import com.jmtg.game.cards.Card;
import com.jmtg.game.cards.CardData;
import com.jmtg.game.cards.CardType;

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
}
