package PART_I_Core.Day28_Lab_Cont.copy;

import java.util.Arrays;

public class Question_10 {

	public static void main(String[] args) {
		
		int[] x= {1,3,3,4,5,6,2};
		
		System.out.println((find23(x)));

	}
	
	public static boolean find23(int[] arr) {
		int dummy2=0, dummy3=0;
		for(int value: arr) {
			if(value==2) {
				dummy2++;
			}else if(value==3) {
				dummy3++;
			}
		}
		if (dummy2==2 || dummy3==2) {
			return true;
		}else {
		return false;
		}
		
	}

}
