package Assignments.Assignment_11;

public class Q_45_shortestWord {

	public static void main(String[] args) {
		
		String[] array= {"java", "cable", "red", "vivid", "remedy", "grace"};

		String shortest=array[0];
		for(String each: array) {
			if(each.length()<shortest.length()) {
				shortest=each;
			}
		}
		System.out.println(shortest);
	}

}
