package PART_I_Core.day10_controlFlowStatements_part4;

public class Task44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//constants
		final int STARTING_KPH=60;
		final int MAX_KPH=130;
		final int INCREMENT=10;
		
		//VARIABLES
		
		int kph=0;
		double mph=0;
		
		for (kph=STARTING_KPH; kph<=MAX_KPH;kph+=INCREMENT) {
			
			// calculate the mph
			mph=kph*0.6214;
			// Display the speeds in kph and mph
			System.out.println(kph + "\t\t" + mph);
		}
	}

}
