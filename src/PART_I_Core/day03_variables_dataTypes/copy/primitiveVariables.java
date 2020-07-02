package PART_I_Core.day03_variables_dataTypes.copy;

public class primitiveVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b1=25;
		byte b2=-25;
		//byte b3=128; hata veriyor. Çunku byte en fazla 127 olabiliyor!!!
		
		System.out.println("b1= " + b1);
		System.out.println("b2= " + b2);
		
		short s1=-32768; // short alt limiti
		short s2=32767; // short üst limiti
		short s3=500;
		
		System.out.println("s1=  " +s1);
		System.out.println("s2=  " +s2);
		System.out.println("s3=  " +s3);
		
		int i1=-2147768;
		int i2= 20;
		int i3= 100_000; // kolay okumak için java 8 sonrasi gelen özellik
		
		System.out.println("i1= " + i1);
		System.out.println("i2= " + i2);
		System.out.println("i3= " + i3);
		
		long l1 = 5000; // suffix L is optional. Because literal 5000 is of int type
		long l2 = -2147483649L; // suffix L is mandatory, this is out of int range.
		
		long creditCardNumber = 5876_1234_3456_9876L;
		
		System.out.println("l1 = " +l1);
		System.out.println("l2 = " +l2);
		System.out.println(" My Credit Card Number is = " +creditCardNumber);
		
		// floating numbers (decimal must be 2 as default)
		float f1 = 2.1f;
		double d1=3.14;
		
		System.out.println("f1 is =" + f1);
		System.out.println("d1 is =" + d1);
		
		char c1='A';
		char c2=65; // decimal value corresponding A
		char c3='\u0041'; 
		System.out.println("c3= " + c3);
		
		char c4='\u8658';
		System.out.println("c4= " + c4);
		
		boolean status= true;
		boolean status2= false;
		
		System.out.println("Eligible to take the exam: " + status);
		System.out.println("He is 16, he can take driver licence? : " + status2);
		
		String name="ozzy";
		System.out.println("My name is :" + name);
		
		String age="12";
		
		
		
				
	}

}
