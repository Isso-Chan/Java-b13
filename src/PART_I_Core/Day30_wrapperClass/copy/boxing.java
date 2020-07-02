package PART_I_Core.Day30_wrapperClass.copy;

public class boxing {

	public static void main(String[] args) {
		
		//AUTOBOXING--> primitive to object
		Integer num1=1234;
		Integer n=5;
		Integer num2=n; //object now

		//UNBOXING--> object to primitive
		Double d1=new Double(34.2);
		double d2=d1;
		System.out.println("d1:"+d1);
		System.out.println("d2:"+d2);
		
		long l1=new Long(600000L); // unboxing
		Long l2= new Long(123456788);// no boxing (
		long l3=l2;
		

		Integer x=345;
		double y=x;
		
		Integer num3=Integer.valueOf(345);
//		Double d3=num3; // HATA verir. Wrapper classlarda casting olmaz. Muhtemelen Object olduğundan
		
		
	}

}
