package PART_I_Core.Day30_wrapperClass.copy;

public class parsingValues {

	public static void main(String[] args) {
		
		String numberAsString="2018";
		System.out.println(numberAsString);

		int number=Integer.parseInt(numberAsString);
		System.out.println(number);
		
		numberAsString=numberAsString+1;
		number=number+1;
		
		System.out.println(numberAsString);
		System.out.println(number);
		
		double number2=Double.parseDouble(numberAsString);
		System.out.println(number2);
		
		byte byt=Byte.parseByte("123");
		System.out.println("byt+byt="+(byt+byt));
		
		short shrt=Short.parseShort("12345");
		System.out.println("shrt+shrt="+(shrt+shrt));
		
		int i=10;
		String s=String.valueOf(i);// INT I STRING YAPIYOR! (Satır 35'in tersi)
		System.out.println(s); // "10" prints as String.Cunku Strin yaptık.
		
		String s2=Integer.toString(i);
//		System.out.println(s2*s2); Hata verir. Cunku String ile carpma yapılmaz
		
		long l2=Long.valueOf(s2); // STRING I LONG YAPIYOR!!! (Satır 29'un tersiiiiii
		System.out.println("l2+l2:"+(l2+l2));//toplma yapar. Cunku string degil.
		
		
	}

}
