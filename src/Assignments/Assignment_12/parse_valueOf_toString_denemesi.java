package Assignments.Assignment_12;

public class parse_valueOf_toString_denemesi {
	
public static void main(String[] args) {
	
	String[] nums= {"12","23.4","odun", "12234567f","12","c"};
	int[] intg= {1,2,3};
	String str=Double.toString(intg[0]);
	byte x=Byte.parseByte(nums[0]);
	String c=String.valueOf(nums[5]);
	

	
	System.out.println(c);
}
}
