package com.jmtg.game.graphics;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JLabel;

import com.jmtg.game.objects.cards.Card;

public class CardInHand extends JLabel {

	private static final long serialVersionUID = 1L;

	private Card card;
	private BufferedImage image;

	public CardInHand(Card card_) {
		this.card = card_;
		this.image = this.card.getImage();
		this.image = createResizedCopy(this.image, (int) (this.image.getWidth() / 1.7), (int) (this.image.getHeight() / 1.7), false);
		this.setVisible(true);
	}

	public void paint(Graphics g) {
		g.drawImage(this.image, 0, 0, null);
		System.out.println(this.getClass().getName() + " DREW");
	}

	BufferedImage createResizedCopy(BufferedImage originalImage, int scaledWidth, int scaledHeight, boolean preserveAlpha) {
		int imageType = preserveAlpha ? BufferedImage.TYPE_INT_RGB : BufferedImage.TYPE_INT_ARGB;
		BufferedImage scaledBI = new BufferedImage(scaledWidth, scaledHeight, imageType);
		Graphics2D g = scaledBI.createGraphics();
		if (preserveAlpha) {
			g.setComposite(AlphaComposite.Src);
		}
		g.drawImage(originalImage, 0, 0, scaledWidth, scaledHeight, null);
		g.dispose();
		return scaledBI;
	}
}