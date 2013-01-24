package com.jmtg.game.graphics.panels.handpanel;

import java.awt.BorderLayout;
import java.awt.Component;

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

	public void removeCard(Card card) {
		this.remove(getComponentWithCard(card));
	}

	public Component getComponentWithCard(Card card) {
		for(Component comp : this.getComponents()) {
			if(comp instanceof CardInHand) {
				if(((CardInHand) comp).getName().toLowerCase().equals(card.getName().toLowerCase())) {
					return comp;
				}
			}
		}
		return null;
		
	}
}
