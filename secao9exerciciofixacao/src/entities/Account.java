package entities;

public class Account {
	private String name;
	private int accountNumber;
	private double accountBalance;
	
	public Account(String name, int numeroConta, double initialDeposit) {
		this.name = name;
		this.accountNumber = numeroConta;
		depositMoney(initialDeposit);
	}
	
	public Account(String name, int numeroConta) {
		this.name = name;
		this.accountNumber = numeroConta;
	}
	
	public void depositMoney(double amount) {
		accountBalance = accountBalance + amount;
	}
	
	public void withdrawMoney(double amount) {
		accountBalance -= amount + 5;
	}
	
	// toString
	public String toString() {
		return "Account Data:\n"
				+ "Account " + accountNumber  + ", Holder: " + name + ", Balance: R$ " + accountBalance + "\n"; 
	}

}
