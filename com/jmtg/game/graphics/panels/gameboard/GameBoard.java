package com.jmtg.game.graphics.panels.gameboard;

import javax.swing.JPanel;

import com.jmtg.game.graphics.panels.gameboard.local.LocalBoard;
import com.jmtg.game.graphics.panels.gameboard.opponent.OpponentBoard;

public class GameBoard extends JPanel {

	private static final long serialVersionUID = 1L;

	public LocalBoard localSide = new LocalBoard();
	public OpponentBoard opponentSide = new OpponentBoard();

	public GameBoard() {
		setLayout(null);
	}

}
