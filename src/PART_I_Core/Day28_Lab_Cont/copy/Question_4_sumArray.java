package PART_I_Core.Day28_Lab_Cont.copy;

public class Question_4_sumArray {

	public static void main(String[] args) {
		
		int[] myArray= {1,2,3};
		int[] myArray1= {1,2,30,34};
		int[] myArray2= {12,23,37,66,77,99};
		
		System.out.println("Sum of the array : "+arraySum(myArray));
		System.out.println("Sum of the array : "+arraySum(myArray1));
		System.out.println("Sum of the array : "+arraySum(myArray2));

	}
	
	public static int arraySum(int[] arr) {
		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			sum=sum+arr[i];
//		}
		for(int value: arr) {
			sum=sum+value;
		}
		return sum;
	}

}
