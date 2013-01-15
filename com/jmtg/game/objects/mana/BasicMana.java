package com.jmtg.game.objects.mana;

public enum BasicMana {

	BLACK("Black", 1), BLUE("Blue", 2), GREEN("Green", 3), RED("Red", 4), WHITE("White", 5), NEUTRAL("Neutral", 6);

	private int type;
	private String name;

	private BasicMana(String name_, int type_) {
		this.type = type_;
		this.name = name_;
	}

	public int getID() {
		return this.type;
	}
	
	public String getName() {
		return this.name;
	}

}
