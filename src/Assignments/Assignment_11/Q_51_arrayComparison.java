package Assignments.Assignment_11;

import java.util.Arrays;

public class Q_51_arrayComparison {

	public static void main(String[] args) {
		
		int[] outer= {1,2,4,6};
		int[] inner= {1,2};
		boolean appear=true;
		for(int i=0;i<inner.length;i++) {
			if(Arrays.binarySearch(outer, inner[i])<-1) {
				appear=false;
				break;
			}
		}
		System.out.println(appear);

	}

}
