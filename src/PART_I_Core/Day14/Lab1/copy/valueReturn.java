package PART_I_Core.Day14.Lab1.copy;

public class valueReturn {

	public static void main(String[] args) {

		int x=sum(2,3); // Metodtan return ile gönderilen degeri tasir. yani x-> result2=6
//		int num2=result;
		System.out.println(sum(2,3));

	}

	public static int sum(int num1, int num2) {
		int result1, result2;
		result1=num1+num2;
		result2=num1*num2;
		System.out.println(result1);
		return result2; // sadece tek variable return edilebilir.
	}
}
