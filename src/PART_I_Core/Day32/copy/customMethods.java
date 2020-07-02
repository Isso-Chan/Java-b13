package PART_I_Core.Day32.copy;

import java.util.ArrayList;
import java.util.Random;

public class customMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> numsList = new ArrayList<>();
		
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		
		printList(numsList);

		ArrayList<Double> doubleList= new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);
		
		System.out.println("-------------");
		
		double sum=sumList(doubleList);
		System.out.println("Sum of double List: "+ Math.round(sum));
		
		ArrayList<Integer> list= getList(15);
		System.out.println(list.toString());
		
		ArrayList<Integer> rList=getRandomList(20);
		System.out.println(rList.toString());
		
		ArrayList<String> strnums=new ArrayList<>();
		strnums.add("123");
		strnums.add("33");
		strnums.add("12");
		ArrayList<Integer> converted=converToIntList(strnums);
		System.out.println(converted);
		
		
		
		
		
		
	}
	
	private static ArrayList<Integer> converToIntList(ArrayList<String> strList) {
		ArrayList<Integer> newLIST= new ArrayList<>();
		
		for(String str: strList) {
			newLIST.add(Integer.parseInt(str));
		}
		return newLIST;
	}

	public static ArrayList<Integer> getRandomList(int size){
		
		Random rd= new Random();
		ArrayList<Integer> randomNums=new ArrayList<>();
		for(int i=1;i<=size;i++) {
			randomNums.add(rd.nextInt(101));
		}
		return randomNums;
		
		
	}

	private static ArrayList<Integer> getList(int size) {
		
		ArrayList<Integer> newList=new ArrayList<>();
			
		for(int i=0;i<size;i++) {
			newList.add(i);
		}
		return newList;
	}

	private static double sumList(ArrayList<Double> dList) {
		Double sum1=0.0;
		for(Double d : dList) {
			sum1=sum1+d;
		}
		return sum1;
	}

	private static void printList(ArrayList<Integer> nums) {
	
		for(Integer n : nums) {  // Artık elimizde objectler var. "int" olmuyor "Integer" oluyor
			System.out.print(n+" ");
		}
	}

}
