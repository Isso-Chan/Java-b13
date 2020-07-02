package PART_I_Core.Day30_wrapperClass.copy;

public class wrapperClass {

	public static void main(String[] args) {
		
		int n1=10;
		Integer n2=new Integer(10);
		System.out.println(n1);
		System.out.println(n2);// bu String

		double d1=44.5;
		Double d2=new Double(44.5);
		Double d3=new Double("44.5");
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d1+d2+d3);// Object ama toplamayı yapar. WRAPPER CLASS sayesinde
		
		char ch1='a';
		Character ch2=new Character('b');
		System.out.println(ch1);
		System.out.println(ch2);
		
		Integer num1= Integer.valueOf(1234);// Bu da object yapmanın diger yolu
		Boolean b1=Boolean.valueOf(true);
		
		
		
		
	}

}
