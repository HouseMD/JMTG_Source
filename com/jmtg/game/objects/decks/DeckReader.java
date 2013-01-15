package com.jmtg.game.objects.decks;

import java.io.File;
import java.util.ArrayList;

import com.jmtg.game.objects.cards.Card;
import com.jmtg.game.objects.cards.CardList;
import com.jmtg.game.util.Reader;

public class DeckReader extends Reader {

	static ArrayList<Card> cards = new ArrayList<Card>();

	public DeckReader(File file) {
		super(file);
		parseIntel();

	}

	public void parseIntel() {
		for (String msg : read) {
			for (CardList list : CardList.values()) {
				if (list.name.equals(msg)) {
					cards.add(new Card(list));
				}
			}
		}
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

}
