package com.ankur.games.monopoly.operations;

import com.ankur.games.monopoly.core.DiceRoll;


/**
 * It uses a Random number generator to give an int from 1-6. 
 * The number of dice used is configurable by setting numberOfDice
 * @author ashah
 *
 */
public class RandomTwoDiceRoller implements DiceRoller {
	
	private int numberOfDice;
	
	public int getNumberOfDice() {
		return numberOfDice;
	}

	public void setNumberOfDice(int numberOfDice) {
		this.numberOfDice = numberOfDice;
	}


	public DiceRoll getDiceRoll() {
		
		return null;
	}

}
