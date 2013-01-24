package com.jmtg.game.graphics.panels.gameboard;

import java.util.ArrayList;

import com.jmtg.game.cards.Card;
import com.jmtg.game.players.Side;

public class GameBoard implements Runnable {

	public ArrayList<BoardCard> boardCards = new ArrayList<BoardCard>();

	public GameBoard() {
	}
	
	public void addCard(Card card, Side side) {
		boardCards.add(new BoardCard(card, side));
	}
	
	public void addCard(BoardCard card) {
		boardCards.add(card);
	}
	
	public BoardCard getBoardCard(BoardCard card) {
		for (BoardCard bCard: boardCards) {
			if(bCard.equals(card)) {
				return bCard;
			}
		}
		return null;
		
	}

	@Override
	public void run() {
	}

}
