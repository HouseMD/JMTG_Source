package com.jmtg.game.graphics.panels.gameboard.types;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import com.jmtg.game.Game;
import com.jmtg.game.cards.Card;
import com.jmtg.game.graphics.panels.gameboard.BoardCard;
import com.jmtg.game.players.Side;

public class ManaBoard extends JPanel {

	private static final long serialVersionUID = 1L;

	public ManaBoard() {
	}

	public void addCard(Card card) {
		BoardCard bCard = new BoardCard(card, Side.LOCAL);
		Game.gameBoard.localSide.manaBoard.add(bCard, BorderLayout.CENTER);
		Game.gameBoard.localSide.manaBoard.repaint();
		Game.gameBoard.localSide.manaBoard.revalidate();
	}

}
