package com.jmtg.game.cards;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import com.jmtg.game.cards.Abilities.Ability;
import com.jmtg.game.cards.mana.BasicMana;
import com.jmtg.game.cards.mana.ManaCost;

public enum CardData {

	BACK("Back", "back", null, null, null, null),

	// MANA
	SWAMP("Swamp", "289319", CardType.MANA, null, new CardColor(BasicMana.BLACK), null), //
	FOREST("Forest", "289328", CardType.MANA, null, new CardColor(BasicMana.GREEN), null), //
	OVERGROWN_TOMB("Overgrown Tomb", "253680", CardType.MANA, null, new CardColor(BasicMana.GREEN, BasicMana.BLACK), null),
	// CREATURES
	ARBOR_ELF("Arbor Elf", "249840", CardType.CREATURE, new ManaCost(0, 0, 0, 1, 0, 0), new CardColor(BasicMana.GREEN), null, 1, 1),

	RAKDOS_KACKLER("Rakdos Kackler", "253596", CardType.CREATURE, new ManaCost(0, 0, 1, 0, 0, 0), new CardColor(BasicMana.RED), null, 1, 1),

	// GOLGARI DECK //

	// CREATURE
	DEATHRITE_SHAMAN("Deathrite Shaman", "290529", CardType.CREATURE, new ManaCost(1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0), new CardColor(BasicMana.BLACK, BasicMana.GREEN), null, 1, 2), //
	LLANOWAR_ELVES("Llanowar Elves", "221892", CardType.CREATURE, new ManaCost(0, 0, 0, 1, 0, 0), new CardColor(BasicMana.GREEN), null, 1, 1),

	// SORCERY
	JARADS_ORDERS("Jarad's Orders", "253633", CardType.SORCERY, new ManaCost(1, 0, 1, 0, 0, 2), new CardColor(BasicMana.GREEN, BasicMana.BLACK), null),

	// INSTANT
	MURDER("Murder", "259677", CardType.INSTANT, new ManaCost(2, 0, 0, 0, 0, 1), new CardColor(BasicMana.BLACK), null),

	// ENCHANTMENT
	RANCOR("Rancor", "253686", CardType.ENCHANTMENT, new ManaCost(0, 0, 1, 0, 0, 0), new CardColor(BasicMana.GREEN), null);

	public String name;
	public String id;
	public CardType type;
	public ManaCost cost;
	public CardColor color;
	public BufferedImage img;
	public int attack;
	public int toughness;

	private CardData(String name_, String id_, CardType type_, ManaCost cost_, CardColor color_, Ability ability) {
		this.name = name_;
		this.id = id_;
		this.type = type_;
		this.cost = cost_;
		this.color = color_;
	}

	// CREATURE CONSTRUCTOR
	private CardData(String name_, String id_, CardType type_, ManaCost cost_, CardColor color_, Ability ability, int attack, int toughness) {
		this.name = name_;
		this.id = id_;
		this.type = type_;
		this.cost = cost_;
		this.color = color_;
		this.attack = attack;
		this.toughness = toughness;
	}

	public CardType getType() {
		return type;

	}

	public BufferedImage getImage() {
		if (this.img != null) {
			return (BufferedImage) this.img;
		} else {
			BufferedImage image = getImageFile();
			this.img = image;
			return this.img;
		}

	}

	public BufferedImage getImageFile() {
		try {
			this.img = ImageIO.read(CardData.class.getResource("/" + this.id + ".jpg"));
			return this.img;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
