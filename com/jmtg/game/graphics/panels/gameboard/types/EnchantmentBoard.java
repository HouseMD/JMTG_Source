package com.jmtg.game.graphics.panels.gameboard.types;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import com.jmtg.game.Game;
import com.jmtg.game.cards.Card;
import com.jmtg.game.graphics.panels.gameboard.BoardCard;
import com.jmtg.game.players.Side;

public class EnchantmentBoard extends JPanel {

	private static final long serialVersionUID = 1L;

	public EnchantmentBoard() {
	}

	public void addCard(Card card) {
		BoardCard bCard = new BoardCard(card, Side.LOCAL);
		Game.gameBoard.localSide.enchantmentBoard.add(bCard, BorderLayout.CENTER);
		Game.gameBoard.localSide.enchantmentBoard.repaint();
		Game.gameBoard.localSide.enchantmentBoard.revalidate();
	}

}
