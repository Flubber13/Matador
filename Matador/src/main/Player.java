package main;

public class Player {
	
	private String name;
	private int player_id;
	private int numberFleetsOwned = 0;
	
	public Player(int player_id, String name) {
		this.player_id=player_id;
		this.name=name;
		this.numberFleetsOwned=numberFleetsOwned;
	}
	
	public int getFleets() {
		return numberFleetsOwned;
	}

}
