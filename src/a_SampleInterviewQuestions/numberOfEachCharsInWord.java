package a_SampleInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class numberOfEachCharsInWord {

	public static void main(String[] args) {
		
		 Map<String,Integer> result=new HashMap<>();
         String str="aaabbcccadeeec";
         for (int i=0;i<str.length();i++){
             if (result.get(str.substring(i, i + 1)) != null){
                 result.put(str.substring(i,i+1),result.get(str.substring(i,i+1))+1);
             }else {
                 result.put(str.substring(i,i+1),1);
             }
         }
         for (String key: result.keySet()) {
             System.out.println(str+" contains "+key+"->"+result.get(key));
         }

         result.forEach((k,v)-> System.out.print(k+v));

	}

}
