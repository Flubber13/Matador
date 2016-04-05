package main;

public class Account {
	
	private int balance;
	
	
	public Account() {
		this.balance = 30000;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void updateBalance(int newBalance) { // Skal laves om
		this.balance = newBalance;
	}

}
