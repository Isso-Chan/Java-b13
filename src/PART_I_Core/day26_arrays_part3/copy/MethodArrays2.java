package PART_I_Core.day26_arrays_part3.copy;

import java.util.Scanner;

public class MethodArrays2 {

	public static void main(String[] args) {
		
		System.out.println(findCar(4,"Honda")); // true

	}
	
	//createArray method--- will accept one parameter which is arraySize
	//user will enter some cars

	//findCar method-- will accept 2 parameters which 1- int value, to find car
	//if car is found - return true
	//if not return false
	
	public static String[] createArray(int arraySize) {
		Scanner sc=new Scanner(System.in);
		String[] carArray=new String[arraySize];
		for(int i=0;i<carArray.length;i++) {
			System.out.print("Enter your car # "+(i+1));
			carArray[i]=sc.next();
		}
		return carArray;
	}
	
//	public static boolean findCar(int value, String toFindCar) {
//		for(String car:createArray(value)) {
//			if(car.equalsIgnoreCase(toFindCar)) {
//				return true;
//			}
//		}
//		return false;
//	}
	public static boolean findCar(int value, String toFindCar) {
	String[] y=createArray(value);
		for(int i=0;i<y.length;i++) {
			if(y[i].equalsIgnoreCase(toFindCar)) {
				return true;
		}
	} return false;
	
	}
//	public static boolean findCar(int size, String toFindCar) {
//		
//		boolean flag=false;
//				
//				for(int i=0; i<createArray(size).length; i++) {	
//					
//					if(createArray(size)[i].equalsIgnoreCase(toFindCar)) {
//						flag=true;
//					}
//				}
//				
//				return flag;
//	}
	
}
