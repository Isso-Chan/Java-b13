package Assignments.Assignment_9;

public class Q_11_SMS_Message {

	public static void main(String[] args) {
		
		String str="Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}";
		String sender, phoneNumber, messageBody;
		
		int nameLeft=str.indexOf('<');
		int nameRight=str.indexOf('>');
		sender=str.substring(nameLeft+1,nameRight);
		System.out.println("Sender: "+sender);
		
		int numberLeft=str.indexOf('[');
		int numberRight=str.indexOf(']');
		phoneNumber=str.substring(numberLeft+1,numberRight);
		System.out.println("Phone Number: "+phoneNumber);
		
		int messageLeft=str.indexOf('{');
		int messageRight=str.indexOf('}');
		messageBody=str.substring(messageLeft+1,messageRight);
		System.out.println("Message Body: "+messageBody);
		
		

	}

}
