package com.jmtg.game.graphics.panels.cardpanel;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.JPanel;

import com.jmtg.game.cards.Card;
import com.jmtg.game.cards.CardData;

public class CardPreviewPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	Image image;
	public CardPreview prev = new CardPreview(new Card(CardData.BACK).getIcon(1));

	public CardPreviewPanel() {
		prev.setVerticalAlignment(WIDTH);
		this.add(prev, BorderLayout.CENTER);

	}

}
