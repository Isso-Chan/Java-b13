package PART_II_OOP.Day44_OOPPractice.CallCenter;

public class WhatsApp extends MessagingApp implements VideoCallable, VoiceCallable{

	@Override
	public void call(String contact) {
		System.out.println("Whatsup calling "+contact+"......");	
	}

	@Override
	public void videoCall() {
		System.out.println("Whatsup-doing a video call Mr. Mike...");
	}

	@Override
	public void sendMessage(String msg) {
		System.out.println("Whatsup sending a message "+msg+" .....");
	}

}
