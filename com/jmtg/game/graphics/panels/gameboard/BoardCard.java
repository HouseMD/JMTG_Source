package com.jmtg.game.graphics.panels.gameboard;

import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.JLabel;

import com.jmtg.game.Game;
import com.jmtg.game.cards.Card;
import com.jmtg.game.cards.CardType;
import com.jmtg.game.cards.types.Creature;
import com.jmtg.game.cards.types.Mana;
import com.jmtg.game.players.Side;

public class BoardCard extends JLabel implements MouseListener {

	private static final long serialVersionUID = 1L;

	public Card card;
	Side side;
	CardType type;
	Icon image;

	public BoardCard(Card card, Side side) {
		this.card = card;
		this.side = side;
		this.type = card.getType();
		this.image = this.card.getIcon(4);
		this.setIcon(this.image);
		addMouseListener(this);
		setCursor(new Cursor(Cursor.HAND_CURSOR));
	}

	public Card getCard() {
		return this.card;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Game.cardPanel.prev.setIcon(card.getIcon(1));

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {

		switch (card.getType()) {
		case MANA:
			((Mana) card).tap(this);
			Game.gameBoard.localSide.manaBoard.revalidate();
			Game.gameBoard.localSide.manaBoard.repaint();
			break;
		case CREATURE:
			((Creature) card).tap(this);
			Game.gameBoard.localSide.creatureBoard.revalidate();
			Game.gameBoard.localSide.creatureBoard.repaint();
			break;
		default:
			break;
		}

	}

}
