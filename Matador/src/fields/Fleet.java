package fields;

import main.Player;

public class Fleet extends AbstractOwnable {
	
	private final int BASERENT = 500;
	private Player owner;
	
	public Fleet(int id) {
		super(id);
	}
	
	public int getRent(int id) {
		return (int) Math.pow(BASERENT, owner.getFleets());
	}

}
