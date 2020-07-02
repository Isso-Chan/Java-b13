package PART_I_Core.Week07_Review_loops_methods;

public class nastedLoop {

	public static void main(String[] args) {
		
		for(int outer=1;outer<=5;outer++) {  //row
			System.out.println("Outer: "+outer);
			
			for(int inner=0;inner<=9;inner++) { //column
				System.out.print(inner+" ");
			}
			System.out.println();
		}
		
//		outer:1 inner: 0 1 2 3 4 5 6 7 8 9 
//		outer:2 inner: 0 1 2 3 4 5 6 7 8 9 
//		      .
	}

}
