package PART_I_Core.Week10_review.copy2;

public class ForEach {

	public static void main(String[] args) {
		
		int[] nums= {5,6,7,11,456,778};
		double[] prices= {19.99, 23.5, 56.34, 23.12, 99.9};
		
		for(int itDoesNotMatter: nums) {  // There is no index manipulation!!!!!!
			System.out.print(itDoesNotMatter+" ");
		}

	}

}
