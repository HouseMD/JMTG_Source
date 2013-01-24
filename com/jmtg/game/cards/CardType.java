package com.jmtg.game.cards;

public enum CardType {

	MANA(1), CREATURE(2), INSTANT(3), SORCERY(4), ARTIFACT(5), PLANSWALKER(6), ENCHANTMENT(7);

	private int type;

	private CardType(int type_) {
		this.type = type_;
	}

	public int getID() {
		return this.type;
	}

}

