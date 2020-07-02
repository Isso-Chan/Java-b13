package PART_I_Core.day05_Unary_Assignment_relations.copy;

public class logicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c1='A';
		char c2=65;
		int i1=5;
		int i2=10;
		
		boolean res1=(i1==i2)&&(c1==c1); // F && --- =F
		System.out.println("res1 = " + res1);
		
		boolean res2= (c1==c2) | (i1==i2); // T | F = T
		System.out.println("res2 = " + res2);
		
		boolean res5= (c1==c2) ^ (i1==i2);
		System.out.println("res5 = " + res5); // T ^ F = T
		
		boolean res6= (c1==c2) ^ (i1!=i2);
		System.out.println("res6 = " + res6); // T ^ T = T
		
		
	}

}
