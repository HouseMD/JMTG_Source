package com.jmtg.game.objects.cards;

import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.HashMap;

import javax.imageio.ImageIO;

import com.jmtg.game.objects.mana.BasicMana;
import com.jmtg.game.objects.mana.ManaCost;

public class Card {

	private String name;
	private CardList card;
	private CardType type;
	private ManaCost cost;
	private CardColor color;
	private int id;
	private BufferedImage img;

	public Card(CardList card_) {
		this.name = card_.name;
		this.type = card_.type;
		this.color = card_.color;
		this.cost = card_.cost;
		this.id = card_.id;
		this.img = getURLImage();

	}

	public BufferedImage getURLImage() {
		try {
			URL url = new URL("http://www.deckbox.org/system/images/mtg/cards/" + this.getID() + ".jpg");
			this.img = ImageIO.read(url);
			return ImageIO.read(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public BufferedImage getImage() {
		if (this.img != null) {
			return (BufferedImage) this.img;
		} else
			return (BufferedImage) getURLImage();

	}

	public CardList getEntree() {
		return card;
	}

	public CardType getType() {
		return this.type;
	}

	public ManaCost getCost() {
		return this.cost;
	}

	public CardColor getColor() {
		return this.color;
	}

	public String getName() {
		return this.name;
	}

	public Integer getID() {
		return this.id;
	}

	public HashMap<BasicMana, Integer> getManaMap() {
		return this.cost.getMap();
	}

}
