package com.jmtg.game.graphics.panels.gameboard.local;

import javax.swing.JPanel;

import com.jmtg.game.graphics.panels.gameboard.types.CreatureBoard;
import com.jmtg.game.graphics.panels.gameboard.types.EnchantmentBoard;
import com.jmtg.game.graphics.panels.gameboard.types.ManaBoard;

public class LocalBoard extends JPanel {

	public static ManaBoard localManaBoard = new ManaBoard();

	private static final long serialVersionUID = 1L;

	public ManaBoard manaBoard = new ManaBoard();
	
	public EnchantmentBoard enchantmentBoard = new EnchantmentBoard();
	
	public CreatureBoard creatureBoard = new CreatureBoard();

	public LocalBoard() {
		setLayout(null);
	}

}
