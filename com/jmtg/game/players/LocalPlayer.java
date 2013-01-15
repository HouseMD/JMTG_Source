package com.jmtg.game.players;

import java.io.File;

import com.jmtg.game.objects.decks.Deck;
import com.jmtg.game.objects.decks.DeckReader;

public class LocalPlayer extends Player {

	private DeckReader reader;

	public LocalPlayer(String name_, File file) {
		super(name_);

		reader = new DeckReader(file);
		deck = new Deck(name_, reader.getCards());

		System.out.println("Reader Read: " + reader.getRead().toString());
		System.out.println("Deck: size:" + deck.getSize() + " name:" + deck.getName() + " cards: " + deck.getCards().toString());

	}
}
