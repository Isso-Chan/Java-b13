package Assignments.Assignment_14.Q_11;

public class SavingsAccount extends BankAccount {

	double interestRate;

	
	public SavingsAccount(double interestRate) {
		this.interestRate = interestRate;
	}


	public double getInterestRate() {
		return interestRate;
	}
}
