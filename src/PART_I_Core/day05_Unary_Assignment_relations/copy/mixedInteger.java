package PART_I_Core.day05_Unary_Assignment_relations.copy;

public class mixedInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i1=5;
		int i2=10;
		float f1=15.5f;
		double d1=20.5;
		
		//int res1=i1+i2;
		//float res2=i1+f1;
		//double res3=i2+d1; // hangisi buyun ozellikteyse onun TYPE ini veriyoruz res3 için.
		
		short firstNumber=10;
		short secondNumber=20;
		
		//int thirdNumber=firstNumber+secondNumber;
		short thirdNumber=(short)(firstNumber+secondNumber);
		
		int b1=20;
		int b2=30;
		int res1=b1+b2;// Casting is required
		
		byte res2=126+1;// Casting required (sonuc 128'den kucuk oldugunda HATA vermez
		
		
		
		
		
	}

}
