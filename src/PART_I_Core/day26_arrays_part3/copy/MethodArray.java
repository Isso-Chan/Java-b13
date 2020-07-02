package PART_I_Core.day26_arrays_part3.copy;

import java.util.Random;

public class MethodArray {

	public static void main(String[] args) {
		
		printArray(5);

	}
	public static int[] creatArray(int arraySize) {
		
		Random rn=new Random();
		int[] myArray=new int[arraySize];
		for(int i=0;i<myArray.length;i++) {
			myArray[i]=rn.nextInt(100);
			
		}
		return myArray;
	}
	public static void printArray(int number) {
		for(int value:creatArray(number)) {
			System.out.println(value);
		}
	}

}
