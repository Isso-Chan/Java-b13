package Assignments.Assignment_14.Q_7;

public class GasTank {

	double amount=0;
	double capacity;
	
	public GasTank(double capacity) {
		this.capacity = capacity;
	}
	
	public void addGas(double add) {
		if(add<=capacity) {
			amount+=add;
		}else {
			amount=capacity;
		}
	}
	
	public void usegas(double use) {
		if(amount-use>0) {
			amount-=use;
		}else {
			amount=0;
		}
	}
	
	public boolean isEmpty() {
		boolean emp=false;
		if(amount<0.1) {
			emp=true;
		}
		return emp;
	}
	
	public boolean isFull() {
		boolean full=false;
		if(amount-capacity>-0.1) {
			full=true;
		}
		return full;
	}
	
	public double getGaslevel() {
		return amount;
	}
	
	public double fillUp() {
		double fill=capacity-amount;
		amount=capacity;
		return fill;
	}
	
	
}
