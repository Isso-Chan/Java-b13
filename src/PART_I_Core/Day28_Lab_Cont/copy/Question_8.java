package PART_I_Core.Day28_Lab_Cont.copy;

public class Question_8 {

	public static void main(String[] args) {
		
		int[] x= {23,3,45,67,89,99};
		System.out.println(compare(x));

	}
	public static boolean compare(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==2 || arr[i]==3) {
				return true;
			}
		}
		return false;
	}

}
