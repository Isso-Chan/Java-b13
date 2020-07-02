package PART_I_Core.Day17_classObject_Part2.copy;

public class BankAccount {
	
	double balance;
	String accountHolder;
	int accountNumber;
	
	public void deposit(double amount) {
		
		System.out.println("depositing $"+amount+ " to "+accountNumber);
		balance+=amount;
	}
	
	public void withdraw(double amount) {
		
		System.out.println("Withdrawing $"+amount+" from "+accountNumber);
		balance-=amount;
		
		if(balance<0) {
			balance-=35;
		}
	}
	
	public void showBalance() {
		System.out.println("--------------");
		System.out.println("Account holder: "+accountHolder);
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: $"+balance);
		System.out.println("------------------");
		
	}
	
	public void charge(double price, String item) {
		if (balance>=price) {
			System.out.println("buying "+item+ " for $ "+price+" from "+accountNumber);
			balance-=price;
		}else {
			System.out.println("in sufficient funds to purschase "+item+" from "+ accountNumber);
		}
	}

}
