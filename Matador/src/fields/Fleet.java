package fields;

import main.Player;

public class Fleet extends AbstractFields implements Ownable {
	
	private final int BASERENT = 500;
	private Player owner;
	
	public Fleet(int id) {
		super(id);
	}

	@Override
	public Player getOwner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setOwner(Player owner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getRent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isOwned() {
		// TODO Auto-generated method stub
		return false;
	}

}
