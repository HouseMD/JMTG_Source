package com.jmtg.game.graphics.panels.gameboard;

import java.awt.BorderLayout;
import java.awt.image.ImageObserver;

import javax.swing.JPanel;

import com.jmtg.game.Game;
import com.jmtg.game.cards.Card;
import com.jmtg.game.players.Side;

public class GameBoard extends JPanel{

	private static final long serialVersionUID = 1L;

	public GameBoard() {
	}
	
	public void addCard(Card card) {
		BoardCard bCard = new BoardCard(card, Side.LOCAL);
		bCard.setVerticalAlignment(ImageObserver.WIDTH);
		Game.gameBoard.add(bCard, BorderLayout.CENTER);
		Game.gameBoard.repaint();
		Game.gameBoard.revalidate();
	}

}
