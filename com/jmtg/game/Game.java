package com.jmtg.game;

import java.io.File;
import java.util.Random;

import com.jmtg.game.players.LocalPlayer;

public class Game implements Runnable {

	int draws;

	private static String path = GetExecutionPath();
	private static File file = new File("C:\\Users\\Marci\\Desktop\\test" + "\\Deck.txt");

	static Random generator = new Random();

	static LocalPlayer me;

	public static void main(String args[]) {

		me = new LocalPlayer("ME", file);

		me.drawCard();
		me.drawCard();
		System.out.println("Hand : " + me.getHand().getCards().toString());
		System.out.println("cards left : " + me.getDeck().getCards().toString());

		Game game = new Game();

		game.run();

	}

	private static String GetExecutionPath() {
		String absolutePath = Game.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		absolutePath = absolutePath.substring(0, absolutePath.lastIndexOf("/"));
		return absolutePath;
	}

	@Override
	public void run() {
		while (true) {
		}
	}
}
