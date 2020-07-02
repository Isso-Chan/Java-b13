package a_SampleInterviewQuestions;

import java.util.Arrays;

public class combineTwoArrays {

	public static void main(String[] args) {
	
		//Suppose we have an array a1, a2, ..., an, b1, b2, ..., bn. Implement an algorithm to change this array
		//to a1, b1, a2, b2, ..., an, bn.
		
		String[] arr1= {"1","2","3","4","5","6","7","8","9"};
		String[] arr2= {"a","b","c","d","e","f","g","h","i"};
		String[] arrNew=new String[arr1.length+arr2.length];

		int newIndex=0;
		for(int i=0;i<arr1.length; i++  ) {
							
				arrNew[newIndex]=arr1[i];
				newIndex++;
				arrNew[newIndex]=arr2[i];
				newIndex++;
		}
		System.out.println(Arrays.toString(arrNew));
	}

}
