package PART_I_Core.day10_controlFlowStatements_part4;

public class ternaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result;
		int score=60;
//		
//		if (score>69) {
//			result="pass";
//		} else {
//			result="fail";
//		}
		
		result=score>60 ? "pass": "fail";
		
		int x=5;
		System.out.println((x>2 ? x<4 ? 10 : 8: 7));
	}

}
