package PART_I_Core.Week10_review.copy2;

public class SumArray {

	public static void main(String[] args) {
		
		double[] prices= {19.99, 23.5, 56.34, 23.12, 99.9};
		
		//loop through item if u find price more than 100, print "item too expensive, you donot need it, exit loop
		
		for(double price: prices) {
			if(price>100) {
				System.out.println("item too expensive, you donot need it");
				break;
			}
		}

		// sum of array
		
		double sum=0;
		for(double s: prices) {
			sum=sum+s;
		}
		System.out.println("Sum of array prices is: "+sum);
	}

}
