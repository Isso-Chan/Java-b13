package Assignments.Assignment_13;

import java.util.ArrayList;
import java.util.Arrays;

public class Q_76_repeatedTwiceInArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> array=new ArrayList<Integer>(Arrays.asList(1,5,3,7,9));
	
		System.out.println(makeTwice(array));
	}

	private static ArrayList<Integer> makeTwice(ArrayList<Integer> arr) {
		ArrayList<Integer> newArr=new ArrayList<>();
		int count=0;
		for(int i=0;i<arr.size()*2;i+=2) {
			newArr.add(i,arr.get(count));
			newArr.add(i+1,arr.get(count));
			count++;
		}
		return newArr;
	}

}
