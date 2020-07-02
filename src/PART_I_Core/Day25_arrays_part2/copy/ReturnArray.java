package PART_I_Core.Day25_arrays_part2.copy;

public class ReturnArray {

	public static void main(String[] args) {
		
		double[] values;
		values=getArray();
		for(double num: values) {
			System.out.print(num+" ");
		}

	}

	public static double[] getArray() {
		double[] array= {1.2,2.3,4.5,5.6};
		return array;
	}
}
