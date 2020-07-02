package Assignments.Assignment_4;

public class Question_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double weight=11, charges=0;
		int miles=500;
		
		if (weight<=2) {
			charges=1.1*(miles/500);
			if (miles%500!=0) {
				charges=charges+1.1;
			}
		} else if (weight>2 && weight<=6) {
			charges=2.2*(miles/500);
			if (miles%500!=0) {
				charges=charges+2.2;
			}
		} else if (weight>6 && weight<=10) {
			charges=3.70*(miles/500);
			if (miles%500!=0) {
				charges=charges+3.70;
			}
		} else if (weight>10) {
			charges=3.80*(miles/500);
			if (miles%500!=0) {
				charges=charges+3.80;
			}
		}
			
			System.out.println("Shipping Charges :" + charges);
			
	}

}
