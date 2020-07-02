package PART_II_OOP.Day45.Exceptions_GroupStudy;

public class MyOwnExceptionTest {
	
public static void main(String[] args) {
		
		try {
            employeeAge(7);
		}catch (MyOwnException e) {
            e.printStackTrace();
        }
		
   }

	public static void  employeeAge(int age) throws MyOwnException{
		      if(age < 0) {
		         throw new MyOwnException("Age can't be less than zero");
		      }else if(age<18){
		    	  throw new MyOwnException();
		      }else {
		    	  System.out.println("Age is: " + age);
		      }
		  
		       
	}

}
