package com.jmtg.game;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.jmtg.game.graphics.panels.cardpanel.CardPreviewPanel;
import com.jmtg.game.graphics.panels.gameboard.GameBoard;
import com.jmtg.game.graphics.panels.handpanel.HandPanel;
import com.jmtg.game.players.LocalPlayer;

public class Game extends JFrame implements Runnable {

	// TODO: fix adding cards to manaBoard.

	static double version = 0.030;
	private static final long serialVersionUID = 1L;

	static String seporator = File.separator.toString();
	private static String path = GetExecutionPath() + seporator + "Deck.txt";
	static String obsolutePath = seporator + "C:" + seporator + "Users" + seporator + "Marci" + seporator + "Desktop" + seporator + "test" + seporator + "Deck.txt";
	private static File file = new File(obsolutePath);

	private static int gameWidth = 1280;
	private static int gameHeight = 720;

	public static LocalPlayer player;
	public static Game game;

	public static GameBoard gameBoard = new GameBoard();
	public static HandPanel handPanel = new HandPanel();
	public static CardPreviewPanel cardPanel = new CardPreviewPanel();

	public static void main(String args[]) {

		game = new Game();
		gameBoard = new GameBoard();
		player = new LocalPlayer("Local", file);

		game.setPreferredSize(new Dimension(gameWidth, gameHeight));
		game.setSize(gameWidth, gameHeight);
		game.setTitle("JMTG v" + version + " DEV");
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.setLayout(null);
		game.setResizable(false);
		game.setLocationRelativeTo(null);
		game.setVisible(true);

		game.run();

		int panelWidth = gameWidth - 50;
		int panelHeight = 140;

		int HandpanelX = ((game.getWidth() - panelWidth - game.getInsets().left - game.getInsets().right) / 2);
		int HandpanelY = gameHeight - (panelHeight + 43);

		handPanel.setBounds(HandpanelX, HandpanelY, panelWidth, panelHeight);
		handPanel.setBorder(BorderFactory.createTitledBorder("Hand"));

		cardPanel.setBounds(game.getWidth() - (223 + 25), 5, 223 + 15, 310 + 30);
		cardPanel.setBorder(BorderFactory.createTitledBorder("Card Preview"));

		gameBoard.setBounds(5, 5, game.getWidth() - (game.getWidth() - (cardPanel.getX() - 5)), game.getHeight() - (game.getHeight() - (handPanel.getY() - 23)));
		gameBoard.setBorder(BorderFactory.createTitledBorder("GameBoard"));

		gameBoard.localSide.setBounds(gameBoard.getWidth() - (gameBoard.getWidth() - 5), (gameBoard.getHeight() / 2) + 12, (gameBoard.getWidth() - 12), (gameBoard.getHeight() / 2) - (5 + 12));
		gameBoard.localSide.setBorder(BorderFactory.createTitledBorder("You"));

		gameBoard.add(gameBoard.localSide);

		gameBoard.opponentSide.setBounds(5, 14, (gameBoard.getWidth() - 12), (gameBoard.getHeight() / 2) - (5 + 12));
		gameBoard.opponentSide.setBorder(BorderFactory.createTitledBorder("Opponent"));

		gameBoard.add(gameBoard.opponentSide);

		gameBoard.localSide.manaBoard.setBounds(5, (gameBoard.localSide.getHeight() / 2) + 4, gameBoard.localSide.getWidth() - 10, (gameBoard.localSide.getHeight() / 2) - (5 + 5));
		//gameBoard.localSide.manaBoard.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		gameBoard.localSide.add(gameBoard.localSide.manaBoard);

		gameBoard.localSide.enchantmentBoard.setBounds(5, 14, gameBoard.localSide.getWidth() / 5, (gameBoard.localSide.getHeight() / 2) - (5 + 5));
		//gameBoard.localSide.enchantmentBoard.setBorder(BorderFactory.createLineBorder(Color.RED));
		gameBoard.localSide.add(gameBoard.localSide.enchantmentBoard);

		gameBoard.localSide.creatureBoard.setBounds(5 + (gameBoard.localSide.getWidth() / 5), 14, (gameBoard.localSide.getWidth() - 10) - (gameBoard.localSide.getWidth() / 5), (gameBoard.localSide.getHeight() / 2) - (5 + 5));
		//gameBoard.localSide.creatureBoard.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		gameBoard.localSide.add(gameBoard.localSide.creatureBoard);

		JButton button = new JButton("Draw");
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				handPanel.revalidate();
				player.drawCard();
				handPanel.revalidate();
			}
		});

		button.setBounds(game.getWidth() - (100 + 12), 450, 100, 50);
		button.setCursor(new Cursor(Cursor.HAND_CURSOR));

		game.add(handPanel);
		handPanel.setVisible(true);
		game.add(cardPanel);
		cardPanel.setVisible(true);
		game.add(gameBoard);
		gameBoard.setVisible(true);
		game.add(button);
		button.setVisible(true);

		game.pack();

	}

	private static String GetExecutionPath() {
		String absolutePath = Game.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		absolutePath = absolutePath.substring(0, absolutePath.lastIndexOf("/"));
		return absolutePath;
	}

	@Override
	public void run() {

	}
}
