package com.jmtg.game.objects.cards;

public enum CardColor {

	BLACK(1), BLUE(2), GREEN(3), RED(4), WHITE(5), NONE(6);

	private int type;

	private CardColor(int type_) {
		this.type = type_;
	}

	public int getID() {
		return this.type;
	}

}
