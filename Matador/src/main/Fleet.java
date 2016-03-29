package main;

public class Fleet extends AbstractOwnable {
	
	private int id;
	private int baserent = 500;
	private Player owner;
	
	public Fleet(int id) {
		this.id=id;
		this.owner=null; // Skal være brættet/banken
	}
	
	public int getRent(int id) {
		return (int) Math.pow(baserent, owner.getFleets());
	}

}
