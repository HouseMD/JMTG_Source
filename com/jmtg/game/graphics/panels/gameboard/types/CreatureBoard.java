package com.jmtg.game.graphics.panels.gameboard.types;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JPanel;

import com.jmtg.game.Game;
import com.jmtg.game.cards.Card;
import com.jmtg.game.cards.types.Enchantment;
import com.jmtg.game.graphics.panels.gameboard.BoardCard;
import com.jmtg.game.players.Side;
import com.jmtg.game.util.RotatedIcon;

public class CreatureBoard extends JPanel {

	private static final long serialVersionUID = 1L;

	public CreatureBoard() {
		setLayout(null);
	}

	public void addCard(Card card) {
		BoardCard bCard = new BoardCard(card, Side.LOCAL);
		bCard.setBounds(60 * Game.gameBoard.localSide.creatureBoard.getComponentCount(), 0, card.getIcon(4).getIconWidth(), card.getIcon(4).getIconHeight());
		Game.gameBoard.localSide.creatureBoard.add(bCard, BorderLayout.CENTER);
		Game.gameBoard.localSide.creatureBoard.repaint();
		Game.gameBoard.localSide.creatureBoard.revalidate();
	}
	
	public void attachEntchantment(Enchantment card, Component bCard_) {
		BoardCard bCard = new BoardCard(card, Side.LOCAL);
		RotatedIcon ri = new RotatedIcon(bCard.card.getIcon(4), RotatedIcon.Rotate.UPSIDE_DOWN);
		bCard.setIcon(ri);
		bCard.setBounds(bCard_.getX(), bCard_.getY() + 10, bCard_.getWidth(), bCard_.getHeight());
		Game.gameBoard.localSide.creatureBoard.add(bCard, BorderLayout.CENTER);
		Game.gameBoard.localSide.creatureBoard.repaint();
		Game.gameBoard.localSide.creatureBoard.revalidate();
	}

}
