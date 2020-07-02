package PART_I_Core.Week10_review.copy2;

import java.util.Arrays;

public class TwoArray {

	public static void main(String[] args) {
		
		//Declare
		//String[][] list
		//String[] list[]
		
		String[][] list=new String[4][3];
		
		list[0][0]="Patatoes";
		list[0][1]="Carrots";
		list[0][2]="Onions";
		
		list[1][0]="Apples";
		list[1][1]="Kiwis";
		list[1][2]="Figs";
		
		list[2][0]="Milk";
		list[2][1]="Eggs";
		list[2][2]="Cheese";
		
		list[3][0]="Bread";
		list[3][1]="Bagel";
		list[3][2]="Muffin";
		
		System.out.println(list[0][0]+","+list[0][1]+","+list[0][2]);
		System.out.println(Arrays.deepToString(list));
		System.out.println(Arrays.toString(list));
		
		for(int i=0;i<list[0].length;i++) {
			System.out.println(list[0][i]);
		}
		for(String x: list[2]) {
			System.out.println(x);
		}
		
		for(int i=0;i<list.length;i++) {
			System.out.println("Row:"+i);
			for(int j=0;j<list[i].length;j++) {
				System.out.print("  Col: "+j+"-");
				System.out.print(list[i][j]);
			}
			System.out.println();
		}
	}

}
