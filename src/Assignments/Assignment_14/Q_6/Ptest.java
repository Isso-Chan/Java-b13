package Assignments.Assignment_14.Q_6;

public class Ptest {

	public static void main(String[] args) {
		
		ParkingMeter p=new ParkingMeter(25);
		
		System.out.println("timeLeft was increased?: "+p.add(5));
		System.out.println("timeLeft is equal to 0?: "+p.isExpired());


	}

}
