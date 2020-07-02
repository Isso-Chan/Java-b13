package PART_II_OOP.Day36.StaticClassMembers;

public class CampusTest {

	public static void main(String[] args) {
		
		Campus c1=new Campus("Mclean");
		Campus c2=new Campus("Arlington");
		
		System.out.println(Campus.country);

	}

}
