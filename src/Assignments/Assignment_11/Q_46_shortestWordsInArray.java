package Assignments.Assignment_11;

import java.util.Arrays;

public class Q_46_shortestWordsInArray {

	public static void main(String[] args) {


		String str="olive,fish,pursuit,old,warning,python,java,coffee,cat,ray";
		String[] array=str.split(",");
		int shortest=100;
		int count=0;
		
		for(int i=0;i<array.length;i++) { // find shortest length
			if(array[i].length()<=shortest) {
				shortest=array[i].length();
			}
		}
		for(String each : array) {       // count shortest elements number
			if(each.length()==shortest) {
				count++;
			}
		}
		
		String[] newArr=new String[count];
		int newNum=0;
		for(int i=0;i<array.length;i++) {  // assign shortest elements to new array
			if(array[i].length()==shortest) {
				newArr[newNum]=array[i];
				newNum++;				
			}
		}
		Arrays.sort(newArr);
		System.out.println(Arrays.toString(newArr));

	}

}
