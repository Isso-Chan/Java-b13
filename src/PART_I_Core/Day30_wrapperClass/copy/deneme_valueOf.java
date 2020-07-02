package PART_I_Core.Day30_wrapperClass.copy;

import java.util.Arrays;

public class deneme_valueOf {

	public static void main(String[] args) {
		
		String[] str= {"ali", "veli", "recep", "baban", "12", "true", "34.5"};
				
		Integer num=Integer.valueOf(str[4]);
		System.out.println(num);
		
		Double d1=Double.valueOf(str[6]);// str[6] yerinde yazan; double özellikte OLMAK ZORUNDA. HATA veriyor yoksa.
		System.out.println(d1);
		String str2=String.valueOf(d1);
		System.out.println(d1+str2);
		System.out.println("****************");
		
		
		Integer[][] arr=new Integer[3][];
		arr[0]=new Integer[]{1,2,3,4};
		arr[1]=new Integer[]{4,5,6};
		arr[2]=new Integer[]{2,6,17,8,9,3};
		
		Double d=Double.valueOf(arr[0][0]);
		String chr=str[4].substring(0,2);
		
		System.out.println(Arrays.binarySearch(arr[2],3));
		
	
		System.out.println(Byte.parseByte(chr));

	}

}
