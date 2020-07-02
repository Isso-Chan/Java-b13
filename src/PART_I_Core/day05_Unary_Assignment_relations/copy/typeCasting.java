package PART_I_Core.day05_Unary_Assignment_relations.copy;

public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b;
		int i=81;
		double d=323.142;
		float f=72.38f;
		char c='A';
		
		c=(char)i;
		System.out.println("i= " + i + " C= " + c);
				
		i=(int)d;
		System.out.println("d= " + d + " i= " + i);
		
		i=(int)f;
		System.out.println("f= " + f + " i= " + i);
		
		b=(byte)d;
		System.out.println("d= " + d + " b= " + b);
	}

}
