package PART_I_Core.day03_variables_dataTypes.copy;

public class constantVariables {

	public static void main(String[] args) {
		

		final double PI=3.14; // PI variable will not be changed by others. It is fixed...
		final String BIRTHDAY="12.12.1992";
		
		//PI=2;
		
		System.out.println(PI);
		
		int myage=46;
		double myheight=1.76;
		String gender="Male";
		
		System.out.println("My Age is =" +myage);
		System.out.println("My height is =" + myheight);
		System.out.println("My gender is =" +gender);
		
	}

}
