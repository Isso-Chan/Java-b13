package PART_I_Core.Day23_stringManipulation_lab3.copy;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
	
		Random rn=new Random();
		
		System.out.println(rn.nextInt(100)-50);
		System.out.println(rn.nextDouble());
		System.out.println(rn.nextFloat());
		System.out.println(rn.nextBoolean());
		
		System.out.println(rn.nextInt(50));
		System.out.println(rn.nextInt(10));
		// give rn 1-15
		System.out.println(rn.nextInt(10)+5);

	}

}
