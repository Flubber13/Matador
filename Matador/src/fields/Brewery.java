package fields;

import dicecup.DiceCup;
import main.Player;

public class Brewery extends AbstractFields implements Ownable {
	
	private Player owner;
	private DiceCup dicecup;
	
	public Brewery(int id) {
		super(id);
		this.owner = null;
	}

	@Override
	public Player getOwner() {
		return this.owner;
	}

	@Override
	public void setOwner(Player owner) {
		this.owner = owner;
	}

	@Override
	public int getRent() {
		return owner.getBreweries()*dicecup.getLastRoll()*100;
	}

	@Override
	public boolean isOwned() {
		return this.owner == null;
	}

}
