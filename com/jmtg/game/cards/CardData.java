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
	OVERGROWN_TOMB("Overgrown Tomb", "253680", CardType.MANA, null, new CardColor(BasicMana.GREEN, BasicMana.BLACK), null), GOLGARI_GUILDGATE("Golgari Guildgate", "270964", CardType.MANA, null, new CardColor(BasicMana.GREEN, BasicMana.BLACK), null),

	// CREATURES
	ARBOR_ELF("Arbor Elf", "249840", CardType.CREATURE, new ManaCost(0, 0, 0, 1, 0, 0), new CardColor(BasicMana.GREEN), null, 1, 1), RAKDOS_KACKLER("Rakdos Kackler", "253596", CardType.CREATURE, new ManaCost(0, 0, 1, 0, 0, 0), new CardColor(BasicMana.RED), null, 1, 1),

	// GOLGARI DECK //

	// CREATURE
	DEATHRITE_SHAMAN("Deathrite Shaman", "290529", CardType.CREATURE, new ManaCost(1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0), new CardColor(BasicMana.BLACK, BasicMana.GREEN), null, 1, 2), //
	LLANOWAR_ELVES("Llanowar Elves", "221892", CardType.CREATURE, new ManaCost(0, 0, 0, 1, 0, 0), new CardColor(BasicMana.GREEN), null, 1, 1), //
	VAMPIRE_NIGHTHAWK("Vampire NightHawk", "260989", CardType.CREATURE, new ManaCost(2, 0, 0, 0, 0, 1), new CardColor(BasicMana.BLACK), null, 2, 3), //
	KNIGHT_OF_INFAMY("Knight of Infamy", "260989", CardType.CREATURE, new ManaCost(1, 0, 0, 0, 0, 1), new CardColor(BasicMana.BLACK), null, 2, 1), //
	TORMENTED_SOUL("Tormented Soul", "249668", CardType.CREATURE, new ManaCost(1, 0, 0, 0, 0, 0), new CardColor(BasicMana.BLACK), null, 1, 1), //
	WOLFIR_SILVERHEAR("Wolfir Silverheart", "240090", CardType.CREATURE, new ManaCost(0, 0, 0, 2, 0, 3), new CardColor(BasicMana.GREEN), null, 4, 4), //
	SLITHERHEAD("Slitherhead", "253586", CardType.CREATURE, new ManaCost(1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0), new CardColor(BasicMana.BLACK, BasicMana.GREEN), null, 1, 1), //
	GATECREEPER_VINE("Gatecreeper Vine", "289217", CardType.CREATURE, new ManaCost(0, 0, 0, 1, 0, 1), new CardColor(BasicMana.GREEN), null, 4, 4), //

	// SORCERY
	JARADS_ORDERS("Jarad's Orders", "253633", CardType.SORCERY, new ManaCost(1, 0, 0, 1, 0, 2), new CardColor(BasicMana.GREEN, BasicMana.BLACK), null), //
	DIABOLIC_REVELATION("Diabolic Revelation", "278196", CardType.SORCERY, new ManaCost(2, 0, 0, 0, 0, 3), new CardColor(BasicMana.BLACK), null), //
	DISENTOMB("Disentomb", "259701", CardType.SORCERY, new ManaCost(1, 0, 0, 0, 0, 0), new CardColor(BasicMana.BLACK), null), //
	ESSENCE_HARVEST("Essence Harvest", "271114", CardType.SORCERY, new ManaCost(1, 0, 0, 0, 0, 2), new CardColor(BasicMana.BLACK), null), //
	CARAVAN_VIGIL("Caravan Vigil", "234444", CardType.SORCERY, new ManaCost(0, 0, 0, 4, 0, 0), new CardColor(BasicMana.GREEN), null), //

	// INSTANT
	FOG("Fog", "253673", CardType.INSTANT, new ManaCost(0, 0, 0, 1, 0, 0), new CardColor(BasicMana.GREEN), null), //
	MURDER("Murder", "259677", CardType.INSTANT, new ManaCost(2, 0, 0, 0, 0, 1), new CardColor(BasicMana.BLACK), null),//
	ULTIMATE_PRICE("Ultimate Price", "253538", CardType.INSTANT, new ManaCost(1, 0, 0, 0, 0, 1), new CardColor(BasicMana.BLACK), null),//

	// ENCHANTMENT
	MARK_OF_THE_VAMPIRE("Mark of the vampire", "253723", CardType.ENCHANTMENT, new ManaCost(1, 0, 0, 0, 0, 3), new CardColor(BasicMana.BLACK), null), RANCOR("Rancor", "253686", CardType.ENCHANTMENT, new ManaCost(0, 0, 1, 0, 0, 0), new CardColor(BasicMana.GREEN), null);

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
