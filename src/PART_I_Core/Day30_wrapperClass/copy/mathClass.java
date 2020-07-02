package PART_I_Core.Day30_wrapperClass.copy;

public class mathClass {

	public static void main(String[] args) {
		
		double result=Math.pow(4.0,2.0);
		System.out.println(result);
		
		double res2=Math.sqrt(25.0);
		System.out.println(res2);
		
		final double PI=Math.PI;
		System.out.println(PI);
		System.out.println();
		
		System.out.println(Math.ceil(Math.pow(4.5, 3.3)));

		System.out.println(Math.ceil(4.5)); // 5'e üste yuvarlar
		System.out.println(Math.floor(4.5));// 4' alta yuvarlar
	}

}
