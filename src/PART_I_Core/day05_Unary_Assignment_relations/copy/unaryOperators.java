package PART_I_Core.day05_Unary_Assignment_relations.copy;

public class unaryOperators {

	public static void main(String[] args) {
		

		int in1=+10;
		int in2=-100;
		int in3=-(in1+in2);
		
		System.out.println("i1= " + in1);
		System.out.println("i2= " + in2);
		System.out.println("i3= " + in3);
		
		boolean flag=true;
		System.out.println(flag);
		System.out.println(!flag);
		
		int i=11, J=4;
		i++;  // same as i=i+1
		--J;
		//System.out.println("i= " +i);
		//System.out.println("J= " +J);
		
		int res=i++ + --J;
		System.out.println("res = " + res);
		
	}

}
