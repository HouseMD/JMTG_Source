package com.jmtg.game.graphics.panels.gameboard.opponent;

import java.awt.BorderLayout;
import java.awt.image.ImageObserver;

import javax.swing.JPanel;

import com.jmtg.game.cards.Card;
import com.jmtg.game.graphics.panels.gameboard.BoardCard;
import com.jmtg.game.players.Side;

public class OpponentBoard extends JPanel {

	private static final long serialVersionUID = 1L;

	public OpponentBoard() {
		setLayout(null);
	}

	public void addCard(Card card) {
		BoardCard bCard = new BoardCard(card, Side.LOCAL);
		bCard.setVerticalAlignment(ImageObserver.WIDTH);
		add(bCard, BorderLayout.CENTER);
		repaint();
		revalidate();
	}

}
