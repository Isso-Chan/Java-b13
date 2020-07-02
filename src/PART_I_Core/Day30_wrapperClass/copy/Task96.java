package PART_I_Core.Day30_wrapperClass.copy;

import java.util.Arrays;

public class Task96 {

	public static void main(String[] args) {
		
		String str1="Today weather is sunny and 72 degree.It is a perfect day to practice java";
		
		String[] str2=str1.split(" ");
		System.out.println(Arrays.toString(str2));
		int degreeF=Integer.parseInt(str2[5]);
		
		
		double celcius=(degreeF-32)*5/9;
		
		System.out.println(degreeF+" is equal to "+Math.round(celcius)+" celcius");

	}

}
