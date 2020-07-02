package PART_I_Core.Week07_Review_loops_methods;

public class startEnd {

	public static void main(String[] args) {
		// if start is less than end: print all numbers between start and end 
		//if starts is bigger than end: print all the numbers from to start in reverse

//		ex=start=5
//		end=8 
//			5 6 7 8
//		start=10
//		end=6
//				10 9 8 7 6
		int start=15, end=8;
		if (start<end)	{
			for(int i=start;i<=end;i++) {
				System.out.print(i+ " ");
			}
		} else if (start>end) {
			for(int i=start;i>=end;i--) {
				System.out.print(i+ " ");
			}

		}
	}

}
