package main;

import desktop_codebehind.Car;
import desktop_resources.GUI;

public class Controller implements IController {
		
	public String getUserString(String message) {
		return GUI.getUserString(message);
	}
	
	public void addPlayer(String name, int balance) {
		GUI.addPlayer(name, balance);
	}
	
	public void addPlayer(String name, int balance, Car car) {
		GUI.addPlayer(name, balance, car);
	}

	public String getUserButtonPressed(String message, String... buttons) {
		return GUI.getUserButtonPressed(message, buttons);
	}

	public int getUserInteger(String message, int min, int max) {
		return GUI.getUserInteger(message, min, max);
	}

	public int getUserInteger(String message) {
		return GUI.getUserInteger(message);
	}

	public String getUserSelection(String message, String... options) {
		return GUI.getUserSelection(message, options);
	}

	public boolean getUserLeftButtonPressed(String message, String trueButton, String falseButton) {
		return GUI.getUserLeftButtonPressed(message, trueButton, falseButton);
	}
	

}
