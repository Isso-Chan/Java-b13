package Assignments.Assignment_12;

import java.util.ArrayList;
import java.util.Arrays;

public class Q_69_repeatAllInArray {

	public static void main(String[] args) {
		
		ArrayList<Boolean> array=new ArrayList<>(Arrays.asList(true, false, false));

		repeatAL(array);

	}

	private static void repeatAL(ArrayList<Boolean> arr) {
		int size=arr.size();
		for(int i=0;i<size;i++) {
			arr.add(arr.get(i));
		}
		System.out.println(arr.toString());
	}
	

}
