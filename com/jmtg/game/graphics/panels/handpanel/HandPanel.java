package com.jmtg.game.graphics.panels.handpanel;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import com.jmtg.game.cards.Card;

public class HandPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public HandPanel() {
	}

	public void addCard(Card card) {
		
		CardInHand cardInHand = new CardInHand(card);
		
		

		cardInHand.setVerticalAlignment(WIDTH);

		this.add(cardInHand, BorderLayout.CENTER);
	}

}
