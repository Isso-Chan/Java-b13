package PART_I_Core.Week10_review.copy2;

import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {
		
		int[] num1= {4,5,2,10};
		int[] num2= {4,5,2,10};
		int[] num3= {10,4,5,2};
		int[] num4= {4,5,2,10,90};
		int[] num5= {54,23,54,123,54};
		
		
//		Int dizisini String yap!!!!
		String str1=Arrays.toString(num5);// köşeli parantezli yazılan arrayi TEK BİR STRİNG olarak kabul ediyor!!!
		System.out.print("Str1:"+str1);
		System.out.print("     str1 length is:"+str1.length());
		System.out.println("   str1 charAt(0) is \""+str1.charAt(0)+ "\"     DİKKAAAAATTTT");
		String[] num5Str=intToString(num5); // String array olarak geri dönüyor.
		
		System.out.println("Str array: "+Arrays.toString(num5Str));
		System.out.println("Int array: "+Arrays.toString(num5));
		System.out.println("num5Str[0]+num5[0]->"+(num5Str[0]+num5[0])); // biri String digeri int concat ediyor
		System.out.println(num5Str[0].equals(num5[0]));
//		System.out.println(Arrays.equals(num5Str,num5)); // HATA veriyor. iki array FARKLI
		
		System.out.println(Arrays.equals(num1,num2)); // arraylerde her bir elemanın karşılaştırılması
		System.out.println(num1==num2); // object karşılaştırması(aynı objectler mi)
		
		System.out.println("===========");
		
		String[] cars1= {"Toyota","Honda","Tesla","BMW","Dodge"};
		String[] cars2= {"Toyota","Honda","Tesla","BMW","Dodge"};
		String[] cars3= {"toyota","honda","tesla","bmw","dodge"};
		String[] cars4= {"Toyota","Honda","Tesla"};
		
		System.out.println(Arrays.toString(cars1));
		System.out.println(Arrays.toString(cars1).toUpperCase());// her elemanı uppercase ederek yazar
		System.out.println(Arrays.toString(num5));
		
		System.out.println("=============");
		
		int[] nums= {44,12,5,900,1,-5};
		System.out.println("Befoe sorting");
		System.out.println(Arrays.toString(nums));
		
		Arrays.parallelSort(nums);                             // ***special char>number>Capital letter>small letter***
		System.out.println("After sorting");
		System.out.println(Arrays.toString(nums));
		
		
		
	}

	private static String[] intToString(int[] arr) {
		String[] str=new String[arr.length];
		for(int i=0;i<arr.length;i++) {
//			str[i]=String.valueOf(arr[i]); // .valueOf-> noktadan önce ne yazılırsa ona çevirir (OBJECT olarak) 
			str[i]=Integer.toString(arr[i]);
		}
		return str;
		
		
	}

}
