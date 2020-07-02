package PART_I_Core.week12_Review_Session;

import java.util.ArrayList;

public class getMonthsArrayList {

	public static void main(String[] args) {
		
		System.out.println(getMonths());

	}

	private static ArrayList<String> getMonths() {
		ArrayList<String> months=new ArrayList<>(); // =ArrayList<>(Arrays.asList("Jan","Feb",,,,,,)) de olabilir.
		months.add("January");
		months.add("Febuary");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		return months;
		
	}
	

}
