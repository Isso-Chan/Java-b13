package Assignments.Assignment_13;


import java.util.ArrayList;
import java.util.Arrays;


public class Q_74_removeFromArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> array=new ArrayList<Integer>(Arrays.asList(3,3,3,3,33,4,33,3));
		Integer number=3;
		
		System.out.println((removeInst(array,number)));

	}

	private static ArrayList<Integer> removeInst(ArrayList<Integer> array, Integer number) {
		
		for(int i=array.size()-1;i>=0;i--) {
			if(array.get(i).equals(number)) {
				array.remove(i);
			}
		}
		return array;
		
	}

}
