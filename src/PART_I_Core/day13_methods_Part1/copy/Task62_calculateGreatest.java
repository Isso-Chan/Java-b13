package PART_I_Core.day13_methods_Part1.copy;

public class Task62_calculateGreatest {

	public static void main(String[] args) {


		calculateGreatest(6,10,20);

	}

	private static void calculateGreatest(int i, int j, int k) {
		if(i>j && i>k) {
			System.out.println(i);
		} else if (j>i && j>k) {
			System.out.println(j);
		} else if(k>i && k>j) {
			System.out.println(k);
		}
		
	}
}
