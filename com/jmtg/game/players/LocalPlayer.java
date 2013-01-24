package com.jmtg.game.players;

import java.io.File;

import com.jmtg.game.decks.DeckReader;
import com.jmtg.game.decks.RandomDeck;

public class LocalPlayer extends Player {

	private DeckReader reader;

	public LocalPlayer(String name_, File file) {

		super(name_);

		reader = new DeckReader(file);
		deck = new RandomDeck(name_, reader.cards);

	}
}
