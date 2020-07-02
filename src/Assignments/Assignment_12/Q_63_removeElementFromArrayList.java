package Assignments.Assignment_12;

import java.util.ArrayList;

public class Q_63_removeElementFromArrayList {

	public static void main(String[] args) {
		
			ArrayList<Double> doubles=new ArrayList<> ();
			doubles.add(2.2);
			doubles.add(25.2);
			doubles.add(31.5);
			doubles.add(5.7);
			doubles.add(1.9);
			doubles.add(8.4);

			System.out.println("Initial elements:"+doubles.toString());
			System.out.println("After removing first two:" +removeTwo(doubles).toString());
	}

	private static ArrayList<Double> removeTwo(ArrayList<Double> d) {
		d.remove(0);
		d.remove(0);
			return d;
	}

}
