package com.jmtg.game.cards.Abilities;

import com.jmtg.game.Game;
import com.jmtg.game.cards.CardType;
import com.jmtg.game.cards.types.Creature;
import com.jmtg.game.graphics.panels.gameboard.BoardCard;


public class Ability {

	String name;

	public Ability(String name) {
		this.name = name;
	}
	
	public static void buffCreature(BoardCard card, int attack, int toughness) {
		BoardCard Bcard = Game.gameBoard.getBoardCard(card);
		Game.gameBoard.boardCards.remove(card);
		if(Bcard.getCard().getType() == CardType.CREATURE) {
			Creature creature = (Creature) Bcard.getCard();
			creature.addAttack(attack);
			creature.addToughness(toughness);
		}
	}
}
