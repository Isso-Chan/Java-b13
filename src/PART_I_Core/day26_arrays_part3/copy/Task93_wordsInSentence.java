package PART_I_Core.day26_arrays_part3.copy;

public class Task93_wordsInSentence {

	public static void main(String[] args) {
		
	String str="As he crossed toward the pharmacy at the corner he involuntarily turned his head because of a\r\n" + 
	"burst of light that had ricocheted from his temple, and saw, with that quick smile with which we\r\n" +
	"greet a rainbow or a rose, a blindingly white parallelogram of sky being unloaded from the van—a\r\n" + 
	"dresser with mirrors across which, as across a cinema screen, passed a flawlessly clear reflection of\r\n" + 
	"boughs sliding and swaying not arboreally, but with a human vacillation, produced by the nature of\r\n" + 
	"those who were carrying this sky, these boughs, this gliding façade";
		
	String[] words=str.split(" ");
	System.out.println(words.length);
	
	for(String value: words)
		System.out.print(value+"-");
	
	System.out.println("-------");
	
	System.out.println(words.length);
	System.out.println(str.length());
	System.out.println(words[2].length());
	}
	

	
	
	

}
