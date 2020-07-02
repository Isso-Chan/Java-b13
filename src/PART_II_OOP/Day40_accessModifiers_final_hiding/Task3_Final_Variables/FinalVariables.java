package PART_II_OOP.Day40_accessModifiers_final_hiding.Task3_Final_Variables;

public class FinalVariables {
	
	public final int ROADSTER_MAX_RANGE=600;
	public final int MODEL_3_MAXSPEED; // Constructor VEYA init block yoksa burada hatayı görürüz.
	public final int MODEL_X_PASSANGERS; // Constructor VEYA init block yoksa burada hatayı görürüz.
	public static final String ADMIN_USERNAME;// 
	
	public FinalVariables() {
		MODEL_3_MAXSPEED=200;
		
	}
	static{
		ADMIN_USERNAME="OZZY";//Sadece burada initialize edilebilir. Class'a ait ve bir defa initialize edilmeli
	}
	{
		MODEL_X_PASSANGERS=7;
	}

	public static void main(String[] args) {
		
		

	}

}
