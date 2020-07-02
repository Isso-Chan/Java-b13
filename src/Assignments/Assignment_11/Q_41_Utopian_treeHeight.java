package Assignments.Assignment_11;

public class Q_41_Utopian_treeHeight {

	public static void main(String[] args) {
		
		int growth=0;
		for(int i=1;i<=10;i++) {
			if(i<=3) {
				growth+=1;
			}else if(i>3) {
				growth+=2;
			}
		}
		System.out.println("Growth after 10 years:"+growth);

	}

}
