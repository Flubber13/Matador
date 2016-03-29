package main;

public class Dice {

	private int lastRoll;

	public int roll(){
		setLastRoll( (int) Math.floor(Math.random()) * 6 );
		return getLastRoll();
	}

	private void setLastRoll(int i) {
		if (0<i && i<6) {
			i = lastRoll;
		}
	}

	public int getLastRoll() {
		return lastRoll;
	}

}
