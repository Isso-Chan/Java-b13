package PART_I_Core.day26_arrays_part3.copy;

public class Array2D {

	public static void main(String[] args) {
		
		int[][] scores = new int[3][4];
		
		System.out.println(scores);
		System.out.println(scores[0]);

		scores[0][0]=1;
		scores[0][1]=2;
		scores[0][2]=3;
		scores[0][3]=4;
		
		scores[1][0]=10;
		scores[1][1]=11;
		scores[1][2]=12;
		scores[1][3]=13;
		
		scores[2][0]=20;
		scores[2][1]=21;
		scores[2][2]=22;
		scores[2][3]=23;
		
		// print first row
		System.out.println(scores[0][0]);
		System.out.println(scores[0][1]);
		System.out.println(scores[0][2]);
		System.out.println(scores[0][3]);
//		System.out.println(scores[0][4]);  4 yazinca hata verir.4. sutun yok cunku!!!!
		
		//print second row
		System.out.println(scores[1][0]);
		System.out.println(scores[1][1]);
		System.out.println(scores[1][2]);
		System.out.println(scores[1][3]);
		
		//print third row
		System.out.println(scores[2][0]);
		System.out.println(scores[2][1]);
		System.out.println(scores[2][2]);
		System.out.println(scores[2][3]);
		
		System.out.println("----------------");
		
		
		
	}

}
