package com.jmtg.game.objects.mana;

import java.util.HashMap;

public class ManaCost {

	private int black = 0;
	private int blue = 0;
	private int red = 0;
	private int green = 0;
	private int white = 0;
	private int neutral = 0;

	public ManaCost(int black_, int blue_, int red_, int green_, int white_, int neutral_) {
		this.black = black_;
		this.blue = blue_;
		this.red = red_;
		this.green = green_;
		this.white = white_;
		this.neutral = neutral_;
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
