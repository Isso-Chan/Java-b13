package PART_I_Core.Day24_arrays_part1.copy;

public class array {

	public static void main(String[] args) {
		
		int[] myList= {10,20,30,40};
		
		String[] myArray= {"Apple","Orange","Watermelon"};
		
		System.out.println(myList[0]);
		
		System.out.println(myArray.length); //3 verir

		int[] scores= {80,90,122,34,56,78,90,98,88,77,65,34}; // Find avarage
		int num=scores.length;
		int sum=0;
		for(int i=0;i<num;i++) {
			sum=sum+scores[i];
		}
		System.out.println("Element number:"+num);
		System.out.println("Sum is:"+ sum);
		System.out.println("Avarage is: "+ (double)(sum/num));
	}

}
