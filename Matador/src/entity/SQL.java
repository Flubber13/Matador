package entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import main.Player;

public class SQL implements DAO, DTO {
	
	private Connection myCon;

	public SQL() throws SQLException {
		myCon = DriverManager.getConnection("jdbc:mysql://localhost/Matador","root","");
	}

	
	// >>>> Data acces objects <<<< //
	
	public int getPosition(Player player) throws SQLException { 
		Statement stmt = myCon.createStatement();
		ResultSet rs = stmt.executeQuery("Select position from player where player_id = '"+player.getPlayerID()+"'");
		rs.next();
		return rs.getInt(1);
	}

	public int getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getJailTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getCardId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getCardPosition() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getFieldId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHouseCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean hasHotel() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isMortgaged() {
		// TODO Auto-generated method stub
		return false;
	}

	public int getVehicleID() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getVehicleColour() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getVehicleType() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getAccountId() {
		// TODO Auto-generated method stub
		return 0;
	} 

	
	
	
	
	
	// >>> Data transfer objects <<<< //
	
	public void createPlayer(int id, int vId, int aId, String name, int position, 
			int jailTime, boolean active, String vColour, String vType)throws SQLException{
		
		Statement stmt = myCon.createStatement();
		ResultSet rs =stmt.executeQuery(
			"insert into bank values(" + aId + ",30000);" +
			"insert into vehicle values(" +vId+ "," +vColour+", "+vType+");" +
			"insert into player values(" +id+ ", "+vId+","+ aId +","+name+ ","+position+",-1,TRUE);"
		);
		rs.next();
	}
	public void updatePosition() {
		// TODO Auto-generated method stub

	}

	public void setBalance() {
		// TODO Auto-generated method stub

	}

	public void setJailTime() {
		// TODO Auto-generated method stub

	}

	public void setCardId() {
		// TODO Auto-generated method stub

	}

	public void setCardPosition() {
		// TODO Auto-generated method stub
	}

	public void setFieldId() {
		// TODO Auto-generated method stub
	}

	public void setHouseCount() {
		// TODO Auto-generated method stub
	}

	public void buildHotel() {
		// TODO Auto-generated method stub
	}

	public void mortgage() {
		// TODO Auto-generated method stub
	}

	public void setVehicleID() {
		// TODO Auto-generated method stub

	}

	public void setVehicleColour() {
		// TODO Auto-generated method stub

	}

	public void setVehicleType() {
		// TODO Auto-generated method stub

	}

	public void setAccountId() {
		// TODO Auto-generated method stub

	}
}