package com.jmtg.game.decks;

import java.io.File;
import java.util.ArrayList;

import com.jmtg.game.cards.Card;
import com.jmtg.game.cards.CardData;
import com.jmtg.game.cards.types.Artifact;
import com.jmtg.game.cards.types.Creature;
import com.jmtg.game.cards.types.Enchantment;
import com.jmtg.game.cards.types.Instant;
import com.jmtg.game.cards.types.Mana;
import com.jmtg.game.cards.types.Sorcery;
import com.jmtg.game.util.Reader;

public class DeckReader extends Reader {

	public ArrayList<Card> cards = new ArrayList<Card>();
	public DeckReader(File file) {
		super(file);
		parseCards();
		

	}

	public void parseCards() {
		for (String msg : read) {
			for (CardData list : CardData.values()) {
				if (list.name.equals(msg)) {
					cards.add(processedCard(list));
				}
			}
		}
	}

	public Card processedCard(CardData list) {

		switch (list.getType()) {

		case ARTIFACT:
			return (new Artifact(list));
		case ENCHANTMENT:
			return (new Enchantment(list));
		case CREATURE:
			return (new Creature(list));
		case INSTANT:
			return (new Instant(list));
		case MANA:
			return (new Mana(list));
		case SORCERY:
			return (new Sorcery(list));
		case PLANSWALKER:
			break;
		default:
			return (new Card(list));
		}
		return null;
	}
}
