package PART_I_Core.Day24_arrays_part1.copy;

public class Task92 {

	public static void main(String[] args) {
		
		int[] array=new int[10];
		for(int i=1;i<=10;i++) {
			array[i-1]=i;
		}
		for(int j=0;j<10;j++) {
			array[j]=array[j]*19;
		}
		for(int k=0;k<10;k++) {
			System.out.println(array[k]);
		}

	}

}
