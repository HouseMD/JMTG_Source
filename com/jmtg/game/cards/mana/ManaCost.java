package com.jmtg.game.cards.mana;

import java.util.HashMap;

public class ManaCost {

	private int black = 0;
	private int blue = 0;
	private int red = 0;
	private int green = 0;
	private int white = 0;
	private int neutral = 0;
	private boolean eitherColor = false;

	public ManaCost(int black_, int blue_, int red_, int green_, int white_, int neutral_) {
		this.black = black_;
		this.blue = blue_;
		this.red = red_;
		this.green = green_;
		this.white = white_;
		this.neutral = neutral_;
	}

	public ManaCost(int black_, int blue_, int red_, int green_, int white_, int neutral_, int black_2, int blue_2, int red_2, int green_2, int white_2, int neutral_2) {
		this.black = black_ + black_2;
		this.blue = blue_ + blue_2;
		this.red = red_ + red_2;
		this.green = green_ + green_2;
		this.white = white_ + white_2;
		this.neutral = neutral_ + neutral_2;
		this.eitherColor = true;
	}
	
	public boolean dualTypes() {
		return eitherColor;
	}

	public HashMap<BasicMana, Integer> getMap() {
		HashMap<BasicMana, Integer> temp = new HashMap<BasicMana, Integer>();

		if (this.black > 0) {
			temp.put(BasicMana.BLACK, this.black);
		}
		if (this.blue > 0) {
			temp.put(BasicMana.BLUE, this.blue);
		}
		if (this.red > 0) {
			temp.put(BasicMana.RED, this.red);
		}
		if (this.green > 0) {
			temp.put(BasicMana.GREEN, this.green);
		}
		if (this.white > 0) {
			temp.put(BasicMana.WHITE, this.white);
		}
		if (this.neutral > 0) {
			temp.put(BasicMana.NEUTRAL, this.neutral);
		}

		return temp;
	}

}
