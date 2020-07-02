package Assignments.Assignment_13;

import java.util.ArrayList;
import java.util.Arrays;

public class Q_77_intactProduct {

	public static void main(String[] args) {
		
		int[] products1= {1,1,1,0};
		int limit1=6;
		int[] products2= {1,1,1,1,0,0,0,0};
		int limit2=2;
		
		System.out.println(badP(products1,limit1));
		System.out.println(badP(products2,limit2));

	}

	private static boolean badP(int[] products, int limit) {
		boolean good=true;
		int count=0;
		for(int value: products) {
			if(value<=1){
				if(value==0) {
					count++;
				}
			}
		}
		if(count<limit) {
			return true;
		}else
		
		return false;
	}

}
