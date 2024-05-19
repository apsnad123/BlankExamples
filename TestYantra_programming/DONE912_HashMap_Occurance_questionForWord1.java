package TestYantra_programming;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class DONE912_HashMap_Occurance_questionForWord1 {

	public static void main(String[] args) {
		//find the occurance of each word in a String

       String sentence="I am am living in in banglore";
       String[] s = sentence.split(" ");
       HashMap<String, Integer> map = new HashMap<String, Integer>();
       for(int i=0;i<s.length; i++ ) {
    	  if(map.containsKey(s[i])) {
    		  map.put(s[i], map.get(s[i])+1);
    	  }else {
    		  map.put(s[i], 1);
    	  }
       }
       System.out.println(map);
	}
	
	//------------------------------------------------------------------------------
	@Test
	public void HashMap_Occurance_question_duplicate_String() {
		 String sentence="I am am living in in banglore";
	       String[] a = sentence.split(" ");
	       HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		for(Entry<String, Integer>m:map.entrySet()) {
			if (m.getValue()>1) {
				System.out.println(m.getKey()+" : "+ m.getValue());
			}
		}
	}
	
	
	//---------------------------------------------
	
	@Test
	public void HashMap_Occurance_question_unique_String() {

		String sentence="I am am living in in banglore";
	       String[] a = sentence.split(" ");
	      		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<a.length;i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		
	for(Entry<String, Integer>m:map.entrySet()) {
		if (m.getValue()==1) {
			System.out.println(m.getKey()+" : "+ m.getValue());
		}
	}

	} 

}
