package PART_I_Core.Week07_Review_loops_methods;

public class labelledForLoop {

	public static void main(String[] args) {

		first:
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(i==1) {
						continue first;
							
					}
					System.out.println("[i="+i+",j="+j+"]");
				}
				
			}
	
	  second:
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==1) {
					break second;
						
				}
				System.out.println("[i="+i+",j="+j+"]");
			}
			
		}
		
	}

	

}
