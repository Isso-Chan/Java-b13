package PART_I_Core.Day20_StringManipulation_part2.copy;

public class Task81_timeStamp {

	public static void main(String[] args) {
	
		String time="10/10/2019 14:59:00";
		System.out.println(timeStamp(time)); //10102019145900 gibi olacak
		
	}

	private static String timeStamp(String date) {
		
		date=date.replace("/","").replace(" ", "").replace(":","");
		return date;
		
	}

}
