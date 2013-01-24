package com.jmtg.game.cards;

import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

import com.jmtg.game.cards.mana.ManaCost;

public class Card {

	protected String name;
	protected CardData card;
	protected ManaCost cost;
	protected CardColor color;
	protected String id;
	protected BufferedImage img;
	protected CardType type;

	public Card(CardData card_) {
		card = card_;
		name = card.name;
		color = card.color;
		cost = card.cost;
		id = card.id;
		img = card.getImage();

	}

	public ImageIcon getIcon(int size) {
		return ImageToIcon(img, size);
	}

	public ImageIcon ImageToIcon(Image img, int multiplier) {
		Image newimg = img.getScaledInstance(img.getWidth(null) / multiplier, img.getHeight(null) / multiplier, java.awt.Image.SCALE_SMOOTH);
		return new ImageIcon(newimg);
	}

	public CardType getType() {
		return type;
	}

	public ManaCost getManaCost() {
		return cost;
	}

	public CardColor getColors() {
		return color;
	}

	public String getName() {
		return name;
	}

	public String getID() {
		return id;
	}

}
