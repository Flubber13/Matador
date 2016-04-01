package main;

public class Player {
	
	private String name;
	private int player_id = 1; 	//--> Jeg forestiller mig, at vi i databasen laver 2 nuller foran,
	private int numFleetsOwned;	//    så det kommer til at hedde 001, 002, osv..
	private int numBreweriesOwned;
	
	public Player(String name) {
		this.name=name;
		this.numFleetsOwned = -1;
		this.numBreweriesOwned = 0;
//		createPlayer();
		player_id++;
	}
	
	public int getFleets() {
		return numFleetsOwned;
	}
	
	public void setFleets() {
		this.numFleetsOwned++;
	}
	
	private void createPlayer(Player player) {
		// Opretter spilleren i databasen. Laves private, da det er en hjælpemetode,
		// eller skal den ligge implicit i konstruktøren?
	}
	
	public int getBreweries() {
		return this.numBreweriesOwned;
	}
	

}
