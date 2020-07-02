package PART_I_Core.Day16_Pbjects_and_Classes.copy;

public class Contact {
	
	String name;
	int phoneNumber;
	String email;
	
	public void call() {
		System.out.println("Calling" + name + "..........");
	}
	
	public void sendMessage() {
		System.out.println("Send message to" + phoneNumber+ "| Name: " + name);
	}
	
	public void sendEmail() {
		System.out.println("Sendin email to " + email);
	}

}
