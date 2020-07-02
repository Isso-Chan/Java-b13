package PART_I_Core.week12_Review_Session;

import java.util.ArrayList;

public class MethodsReturnArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> x=getIntegerList(6);
		System.out.println(x);

	}
	
	public static ArrayList<Integer> getIntegerList(int size) { //
		
		ArrayList<Integer> numbers=new ArrayList<>();
		for(int i=0;i<=size;i++) {
			numbers.add(i);
		}
		return numbers;
	}

	
}
