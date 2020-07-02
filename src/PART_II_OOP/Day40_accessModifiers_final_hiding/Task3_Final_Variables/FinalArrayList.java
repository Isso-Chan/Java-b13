package PART_II_OOP.Day40_accessModifiers_final_hiding.Task3_Final_Variables;

import java.util.ArrayList;

public class FinalArrayList {

	public static void main(String[] args) {
		
		final ArrayList<String> COLORS = new ArrayList<>();

		COLORS.add("Orange");
		COLORS.add("Red");
		COLORS.remove(0);

		//COLORS = new ArrayList<String>();

	}

}
