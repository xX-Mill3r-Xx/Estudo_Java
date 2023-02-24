package util;

public class Account {
	private int Number;
	private String Holder;
	private double Balance;
	
	public Account() {}
	
	public Account(int number, String holder) {
		Number = number;
		Holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) {
		Number = number;
		Holder = holder;
		Deposit(initialDeposit);
	}

	public int getNumber() {
		return Number;
	}

	public String getHolder() {
		return Holder;
	}

	public void setHolder(String holder) {
		Holder = holder;
	}

	public double getBalance() {
		return Balance;
	}


	public void Deposit(double amount) {
		Balance += amount;
	}
	
	public void withDrawn(double amount) {
		double tax = 5.0;
		Balance -= amount+tax;
	}
	
	public String toString() {
		return "Account"
				+ Number
				+ ", Holder: "
				+ Holder
				+ ", Balance: $ "
				+ String.format("%.2f", Balance);
	}
}
