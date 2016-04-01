package main;

public class Player {
	
	private String name;
	private static int player_id = 1; 	//--> Jeg forestiller mig, at vi i databasen laver 2 nuller foran,
	private int numberFleetsOwned = 0;	//    så det kommer til at hedde 001, 002, osv..
	private int numBreweriesOwned = 0;
	
	public Player(String name) {
		this.name=name;
		this.numberFleetsOwned=numberFleetsOwned;
		this.numBreweriesOwned=numBreweriesOwned;
//		createPlayer();
		player_id++;
	}
	
	public int getFleets() {
		return numberFleetsOwned;
	}
	
	private void createPlayer(Player player) {
		// Opretter spilleren i databasen. Laves private, da det er en hjælpemetode,
		// eller skal den ligge implicit i konstruktøren?
	}
	
	public int getBreweries() {
		return this.numBreweriesOwned;
	}
	

}
