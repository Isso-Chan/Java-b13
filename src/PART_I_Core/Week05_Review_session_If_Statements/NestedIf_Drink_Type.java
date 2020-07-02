package PART_I_Core.Week05_Review_session_If_Statements;

public class NestedIf_Drink_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String choose="cold";
		String hotdrink="Tea"; 
		String colddrink="icetea";
		boolean isSelected=false;
		
		if (choose=="Hot") {
			if (hotdrink=="Tea") {
				System.out.println("Your total for " + hotdrink + " is $2");
			}
			else if (hotdrink=="coffee") {
				System.out.println("Your total for " + hotdrink + " is $4");
			} else
				isSelected=true;
		} else if (choose=="cold") {
				if (colddrink=="icetea") {
					System.out.println("Your total for " + colddrink + " is $3.2");
				}
				if (colddrink=="Lemonade") {
					System.out.println("Your total for " + colddrink + " is $3.5");
				}
				else 
					isSelected=true;
		} else 
			isSelected=true;
		
		if (isSelected) {
			System.out.println("Please try again");
		}
		
	}

}
