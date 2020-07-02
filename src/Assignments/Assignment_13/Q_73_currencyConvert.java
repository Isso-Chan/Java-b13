package Assignments.Assignment_13;

public class Q_73_currencyConvert {

	public static void main(String[] args) {
		
//		String[][] money={{"drachma","11.0"},{"sek","5.0"}};
//		String[][] conversionRate={{"drachma","0.6"},{"sek","100"}};
		String[][] money={{"yen","5.0"},{"frank","5.0"}};
		String[][] conversionRate={{"yen","1"},{"frank","1"}};
		
		System.out.println(convertC(money,conversionRate));

	}

	private static double convertC(String[][] money, String[][] conversionRate ) {
		double value=0;
		for(int i=0;i<money.length;i++) {
			value=value+(Double.parseDouble(money[i][1])*Double.parseDouble(conversionRate[i][1]));
		}
		
		return value;
	}

}
