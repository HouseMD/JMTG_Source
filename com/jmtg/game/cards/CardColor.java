package com.jmtg.game.cards;

import java.util.ArrayList;

import com.jmtg.game.cards.mana.BasicMana;

public class CardColor extends ArrayList<BasicMana> {

	private static final long serialVersionUID = 1L;

	public CardColor(BasicMana type1) {
		this.add(type1);
	}

	public CardColor(BasicMana type1, BasicMana type2) {
		this.add(type1);
		this.add(type2);
	}

	public void addColor(BasicMana type) {
		this.add(type);
	}

}
