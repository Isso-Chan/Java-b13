package PART_I_Core.Day24_arrays_part1.copy;

public class Task90 {

	public static void main(String[] args) {
		
		String[] car= {"Honda", "Toyota","Nissan","BMW","Mercedes","Porsche","Ferrari"};
		boolean find=false;
		for(int i=0;i<car.length;i++) {
			if(car[i].equals("Honda")) {
				find=true;
				break; // bulursa digerlerinde bosuna aramasin!!!
			}
		}
		if(find) {
			System.out.println("I found your car in array");
		}else
			System.out.println("I could not find your car in array");
		

	}

}
