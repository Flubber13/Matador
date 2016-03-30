package fields;

import main.Player;

public class Territory extends AbstractFields implements Ownable {
	
	public Territory(int id) {
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
