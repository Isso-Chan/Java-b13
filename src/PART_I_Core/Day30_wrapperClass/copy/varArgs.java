package PART_I_Core.Day30_wrapperClass.copy;

public class varArgs {

	public static void main(String[] args) {
		
		sum(2,4);
		sum(2,3,5,6);

//		String[][] sss= {{"Apple","Orange","123","Result"},
//				{"123","456","890"}}; // Array olaray String... kabul etmiyor!!!!
		concat("Apple","Orange","123","Result");
//		concat(sss);
		
	}
	private static void concat(String[][] sss) {
		// TODO Auto-generated method stub
		
	}
	public static void sum(int... numbers) {
		int sum=0;
		for(int value: numbers) {
			sum=sum+value;
		}
		System.out.println(sum);
	}
	
	public static void concat (String... strs) {
		String newStr="";
		for(String str: strs) {
			newStr=newStr+str.charAt(2); // 3rd char of each element is printed
		}
		System.out.println(newStr);
	}

}
