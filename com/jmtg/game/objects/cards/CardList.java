package com.jmtg.game.objects.cards;

import com.jmtg.game.objects.mana.ManaCost;

public enum CardList {

	// MANA
	BLACK_MANA("Swamp", 289319, CardType.MANA, null, CardColor.BLACK),
	// CREATURES
	ARBOR_ELF("Arbor Elf", 249840, CardType.CREATURE, new ManaCost(0, 0, 0, 1, 0, 0), CardColor.GREEN),

	RAKDOS_KACKLER("Rakdos Kackler", 253596, CardType.CREATURE, new ManaCost(0, 0, 1, 0, 0, 0), CardColor.RED);

	public String name;
	public int id;
	public CardType type;
	public ManaCost cost;
	public CardColor color;

	private CardList(String name_, int id_, CardType type_, ManaCost cost_, CardColor color_) {
		this.name = name_;
		this.id = id_;
		this.type = type_;
		this.cost = cost_;
		this.color = color_;
	}

}
