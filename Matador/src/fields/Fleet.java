package fields;

import main.Player;

public class Fleet extends AbstractFields implements Ownable {
	
	private final int BASERENT = 500;
	private Player owner;
	
	public Fleet(int id) {
		super(id);
		this.owner=null;
	}

	public Player getOwner() {
		return this.owner;
	}

	public void setOwner(Player owner) {
		this.owner=owner;
		owner.setFleets();
	}

	public int getRent() {
		return (int) Math.pow(2, owner.getFleets())*BASERENT;
	}

	public boolean isOwned() {
		return this.owner==null;
	}

}
