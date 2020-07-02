package PART_I_Core.Day27_arrays_part4.copy;

public class Question_1 {

	public static void main(String[] args) {
		
		int[] x= {1,2,3,5,6};
		int[] y= {6,2,3,5,1,9};
		int[] z= {13,2,3,5,6,99};
		
		System.out.println(array(x));
		System.out.println(array(y));
		System.out.println(array(z));

	}
	public static boolean array(int[] arr) {
		
		if(arr.length<1) {
			return false;
		}
		
		if(arr[0]==6 || arr[arr.length-1]==6) {
			return true;
		}else
		return  false;
	}

}
