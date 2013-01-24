package com.jmtg.game.logic.phases;

public enum Phase {

	BEGINNING_PHASE("Beginning Phase", 1),

	FIRST_MAIN_PHASE("First Main Phase", 2),

	COMBAT_PHASE("Combat Phase", 3),

	SECOND_MAIN_PHASE("Second Main Phase", 4);

	String name;
	int id;

	private Phase(String name, int id) {
		this.name = name;
		this.id = id;
	}

}
