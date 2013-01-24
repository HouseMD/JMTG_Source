package com.jmtg.game.graphics.panels.handpanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.JLabel;

import com.jmtg.game.Game;
import com.jmtg.game.cards.Card;

public class CardInHand extends JLabel implements MouseListener {

	private static final long serialVersionUID = 1L;
	final Card card;
	Icon image;

	public CardInHand(Card card_) {
		this.card = card_;
		this.image = this.card.getIcon(3);
		this.setIcon(this.image);
		addMouseListener(this);
	}
	
	public String getName() {
		return card.getName();
	}

	public int getWidth() {
		return this.image.getIconWidth();
	}

	public int getHeight() {
		return this.image.getIconHeight();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Game.cardPanel.prev.setIcon(card.getIcon(1));
	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		Game.player.playCard(card);

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	
	

}
