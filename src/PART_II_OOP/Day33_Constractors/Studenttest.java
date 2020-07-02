package PART_II_OOP.Day33_Constractors;

public class Studenttest {

	public static void main(String[] args) {
		
	Student s1=new Student("Mike", 17, 'M', 2001, "Java");
	Student s2=new Student("Smith", 25, 'M', 1999, "TS");
	
	s1.attedLecture();
	s2.attendLab();
	s1.submitAssignment();
	

	}

}
