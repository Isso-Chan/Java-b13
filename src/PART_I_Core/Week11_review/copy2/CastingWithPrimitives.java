package PART_I_Core.Week11_review.copy2;

public class CastingWithPrimitives {

	public static void main(String[] args) {
		
		int intValue=123;
		double doubleValue=intValue;
		
		Integer wrapperInt=Integer.valueOf(100);
		Double wrapperDouble=(double) wrapperInt; // biz casting yapmazsak hata verir. Çünkü wrapperda autmatic casting yoktur.

	}

}
