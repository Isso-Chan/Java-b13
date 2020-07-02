package PART_II_OOP.Day44_OOPPractice.CallCenter;

public class CallCenter {

	public static void main(String[] args) {
		
		WhatsApp wa=new WhatsApp();
		wa.launch();
		wa.allOSCompatible=true;
		wa.isFree=true;
		wa.name="WhatsApp";
		wa.call("Ozzy");
		wa.sendMessage("Thank you");
		wa.videoCall();
		wa.accept();
		
		VoiceCallable.decline(); // interface'ten method çağırıyor
		System.out.println(VoiceCallable.CAN_CALL);
		
		wa.getClass();
		wa.setCount(4);
		
		System.out.println("***************************");
		
		

	}

}
