package entity;

public interface DAO {
	
	// Data Acces object - getters
	
	int getPosition();
	int getBalance();
	int getJailTime();
	int getCardId();
	int getCardPosition();
	int getFieldId();
	int getHouseCount();
	boolean hasHotel();
	boolean isMortgaged();
	int getVehicleID();
	String getVehicleColour();
	String getVehicleType();
	int getAccountId();

}
