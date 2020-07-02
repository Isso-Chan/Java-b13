package PART_II_OOP.Day45_Exceptions;

public class tryCatch2 {

	public static void main(String[] args) {
		
		int[] nums= {26,6,34,12};
		
//		System.out.println(nums{0]);// compile error, yanlış yazım
		
		try{
			System.out.println(nums[6]);
		}catch(Exception e) {
			//System.out.println("Wrong index");
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("=================");
		
		try {
			int j=100;
			int n=j/0;
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
