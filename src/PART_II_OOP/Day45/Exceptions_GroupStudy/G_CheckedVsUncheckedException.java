package PART_II_OOP.Day45.Exceptions_GroupStudy;

public class G_CheckedVsUncheckedException {

	public static void main(String[] args) {
		
				//Thread.sleep(1000);
				
				try {
					Thread.sleep(2000);
					
				}catch(InterruptedException e) {
					e.printStackTrace();
					
				}
		
			}

}
