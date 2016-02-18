package com.ankur.games.monopoly.core;

/**
 * A class to hold the face values for roll of all dice. 
 */
public class DiceRoll {
	
	private int[] rolls;
	private int totalRoll=0;
	private boolean areRollsIdentical;
	
	public DiceRoll(int... rolls) {
		this.rolls = rolls;
		this.areRollsIdentical = true;
		
		int lastRoll = rolls[0];
		for(int thisRoll: rolls) {
			this.totalRoll = this.totalRoll + thisRoll;
			if(lastRoll != thisRoll) {
				this.areRollsIdentical = false;
			}
			lastRoll = thisRoll;
		}
	}

	/**
	 * Sums up the roll values of all the dice. 
	 * Min and Max value depends on how many dice are being rolled by the DieRoller implementation.
	 * @return int
	 */
	public int getTotalRoll() {
		return this.totalRoll;
	}
	
	/**
	 * Returns true only if the roll values of all the dice are same. If not then it returns false. 
	 * @return boolean 
	 */
	public boolean areRollsIdentical() {
		return this.areRollsIdentical;
	}

	public int[] getRolls() {
		return rolls;
	}
	
}
