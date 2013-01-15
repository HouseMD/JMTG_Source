package com.jmtg.game.objects.mana;

public enum DualMana {

	BLACK_BLUE(BasicMana.BLACK, BasicMana.BLUE), BLACK_GREEN(BasicMana.BLACK, BasicMana.GREEN), BLACK_RED(BasicMana.BLACK, BasicMana.RED), BLACK_WHITE(BasicMana.BLACK, BasicMana.WHITE),

	BLUE_GREEN(BasicMana.BLUE, BasicMana.GREEN), BLUE_RED(BasicMana.BLUE, BasicMana.RED), BLUE_WHITE(BasicMana.BLUE, BasicMana.WHITE),

	GREEN_RED(BasicMana.GREEN, BasicMana.RED), GREEN_WHITE(BasicMana.GREEN, BasicMana.WHITE),

	RED_WHITE(BasicMana.RED, BasicMana.WHITE);

	private BasicMana type1;
	private BasicMana type2;

	private DualMana(BasicMana type1_, BasicMana type2_) {
		this.type1 = type1_;
		this.type2 = type2_;
	}

	public BasicMana getType1ID() {
		return this.type1;
	}

	public BasicMana getType2ID() {
		return this.type2;
	}

}
