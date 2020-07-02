package PART_I_Core.day11_whileLoop;

public class Task53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		int sumEven=0;
		while (i<100) {
			
			if(i%2==0) {
				
				sumEven=sumEven+i;
			}
			i++;
		}
		System.out.println(sumEven);
	}

}
