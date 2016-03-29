package main;

public class Fleet extends AbstractOwnable {
	
	private int id;
	private final int BASERENT = 500;
	private Player owner;
	
	public Fleet(int id) {
		this.id=id;
		owner=null; // Skal være brættet/banken
	}
	
	public int getRent(int id) {
		return (int) Math.pow(BASERENT, owner.getFleets());
	}

}
