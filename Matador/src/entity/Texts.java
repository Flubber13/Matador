package entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import main.ControllerGUI;

public class Texts {

	private BufferedReader in;
	private enum Sprog {Dansk, Engelsk};
	private String valgtSprog;
	private ControllerGUI c = new ControllerGUI();

	public Texts() {
		valgtSprog = c.getUserSelection("Choose your language", "Dansk", "English");
	}

	public void openFile(){
		String file = "Dansk.txt";

		if (this.valgtSprog.equals("English"))
			file = "English.txt";

		try {
			in = new BufferedReader(new FileReader(file));
		} catch (IOException e) {
			// Hvad skal der ske?
		}
	}

	public String[] readStrings(){
		String[] strings = null;
		try {
			strings = in.readLine().split(";");
		} catch (IOException e) {
			// Hvad skal der ske?
		}
		return strings;
	}
	public void closeFile(){
		try {
			if (in!=null)in.close();
		} catch (IOException e) {
			// Hvad skal der ske?
		}
	}


}
