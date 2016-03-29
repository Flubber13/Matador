package dicecup;

public class DiceCup {

	private Dice die1;
	private Dice die2;

	public int roll(){
		return die1.roll() + die2.roll();
	}

	public boolean hasPair() {
		return die1.getLastRoll() == die2.getLastRoll();
	}

}