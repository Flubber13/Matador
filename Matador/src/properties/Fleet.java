package properties;

import main.AbstractOwnable;
import main.Player;

public class Fleet extends AbstractOwnable {
	
	private final int BASERENT = 500;
	private Player owner;
	
	public Fleet(int id) {
		super(id);
		owner=null; // Skal være brættet/banken
	}
	
	public int getRent(int id) {
		return (int) Math.pow(BASERENT, owner.getFleets());
	}

}
