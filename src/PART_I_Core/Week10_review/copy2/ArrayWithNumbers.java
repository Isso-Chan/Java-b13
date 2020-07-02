package PART_I_Core.Week10_review.copy2;

public class ArrayWithNumbers {

	public static void main(String[] args) {
		// declare numsArray with numbers and assign values to each index
		
		int[] numsArray=new int[5];
		
		numsArray[0]=123;
		numsArray[1]=345;
		numsArray[2]=33;
		numsArray[3]=10;
		numsArray[4]=numsArray[0]+numsArray[1];
		
		//declare and assign values in same statement
		int[] numsArray2= {44,33,66,77,99};
		
		int[] numsArray3= new int[]{44,33,66,77,99}; // An other way to create an array,
		
		// declrae 3 int variables and assign values
		
		int n1=23;
		int n2=45;
		int n3=10;
		String str1="apple";
		
		int[] numsArray4={n1,n2,n3}; // içine str1 dersek OLMAZ. Aynı tip olmali
		
		//print last element
		
		int l1=numsArray4.length-1;
		
		
		
		
	}

}
