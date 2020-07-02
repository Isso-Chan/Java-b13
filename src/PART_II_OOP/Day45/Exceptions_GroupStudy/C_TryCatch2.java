package PART_II_OOP.Day45.Exceptions_GroupStudy;

public class C_TryCatch2 {

	public static void main(String[] args) {
	
				int[] nums = {36,6,34,12};
				//System.out.println(nums{0]);//compile error
		
				try {
					System.out.println(nums[6]);
				}catch(Exception e) {
					
					//System.out.println("Wrong index");
					//System.out.println(e.getStackTrace());
					//e.printStackTrace();
					//System.out.println(e.getMessage());
				}
				
				try {
					String str=null;
					System.out.println(str.toString());
					int j=100;
					int n=j/0;
				}catch(RuntimeException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				
				
				
			}

}
