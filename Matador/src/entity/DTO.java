package entity;

import java.sql.SQLException;

public interface DTO {
	
	// Data Transfer Objekt - Setters
	void createPlayer(int id, int vId, int aId, String name, int position, 
			int jailTime, boolean active, String vColour, String vType)throws SQLException ;
	void updatePosition();
	void setBalance();
	void setJailTime();
	void setCardId(); // Ikke nødvendig?
	void setCardPosition();
	void setFieldId(); // Ikke nødvendig?
	void setHouseCount();
	void buildHotel();
	void mortgage();
	void setVehicleID(); // Ikke nødvendig?
	void setVehicleColour();
	void setVehicleType();
	void setAccountId(); // Ikke nødvendig?

}
