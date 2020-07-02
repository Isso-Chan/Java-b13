package Assignments.Assignment_5;

public class Question_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int code=303;
		
		switch (code) {
		case 200:
			System.out.println("OK"); break;
		case 201:
			System.out.println("Created"); break;
		case 202:
			System.out.println("Accepted"); break;
		case 301:
			System.out.println("Moved Permanently"); break;
		case 303:
			System.out.println("See other"); break;
		case 304:
			System.out.println("Not modified"); break;
		case 307:
			System.out.println("Temporary Redirected"); break;
		case 400:
			System.out.println("Bad request"); break;
		case 401:
			System.out.println("Unautorized"); break;
		case 403:
			System.out.println("Forbidden"); break;
		case 404:
			System.out.println("Not Found"); break;
		case 410:
			System.out.println("Gone"); break;
		case 500:
			System.out.println("Internal Server Error"); break;
		case 503:
			System.out.println("Service Unavialible"); break;
		default:
			System.out.println("Invalid status code"); break;	
		}
		
	}

}
