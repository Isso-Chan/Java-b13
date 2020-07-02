package Assignments.Assignment_11;

public class Q_40_largestElement {

	public static void main(String[] args) {
		
		String[] str= {"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};

		String  largest="";
		for(String value: str) {
			if(value.length()>largest.length()) {
				largest=value;
			}
		}
		System.out.println(largest);
	}

}
