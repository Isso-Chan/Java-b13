package PART_I_Core.Day25_arrays_part2.copy;

public class ForEachLoop {

	public static void main(String[] args) {

		String[] products= {"Timberland","Shirt","Watch","Bag","Shoes"};
		double[] prices= {120.0,12.99,300,25,67.89};
		
		for(String prod: products) {
			System.out.println(prod);
		}

		System.out.println("-----------------");
		for(double prc: prices) {
			System.out.println(prc);
		}
		//print products item in reverse order
		System.out.println("=================");
		for(int i=products.length-1;i>=0;i--) {
			System.out.println(products[i]);
		}
		System.out.println("-----------------");
		for(String str : products) {
			for(int j=0;j<str.length();j++) {
				System.out.print(str.substring(j,j+1)+" ");
				System.out.print(str.charAt(j)+" ");
			}
			System.out.println();
		}
	}

}
