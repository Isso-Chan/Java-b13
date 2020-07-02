package Assignments.Assignment_14.Q_1;

public class Atts {

		String name;
		String color;
		int amount;
				
		public String asString() {
			return "name:"+name+" color:"+color+" amount:"+amount;	
		}
		
		public static void main(String[] args) {
			Atts a=new Atts();
			a.name="table";
			a.color="brown";
			a.amount=1;
			
			System.out.print(a.asString());	
		}

}
