package TestYantra_programming;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class DONE911_HashMap_Occurance_questionForCharacter1 {

	//find the occurance of each character in a word
	@Test
	public void count() {
		
		String name="Kannada";
		String n= name.toLowerCase();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<n.length();i++) {
			if(map.containsKey(n.charAt(i))) {
				map.put(n.charAt(i), map.get(n.charAt(i))+1);
			}else {
				map.put(n.charAt(i), 1);
			}
		}
      System.out.println(map);
  	System.out.println("----------------------------------------------------");

	}
	
	@Test
	public void name() {
	String name="Kannadaana";
	String n = name.toLowerCase();
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	for (int i = 0; i < n.length(); i++) {
		if (map.containsKey(n.charAt(i))) {
			map.put(n.charAt(i), map.get(n.charAt(i))+1);
		}else {
			map.put(n.charAt(i), 1);
		}
	}
	for(Entry<Character, Integer> m:map.entrySet()) {
		if (m.getValue()==1) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
	}
	System.out.println("----------------------------------------------------");
	}
	@Test
	public void duplicate() {
	
		String name="Kananadfghdfdf";
		String n = name.toLowerCase();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < n.length(); i++) {
			char a = n.charAt(i);
			if (map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			}else {
				map.put(a, 1);
			}
		}
		
		for(Entry<Character, Integer> m:map.entrySet()) {
			if (m.getValue()>1) {
				System.out.println(m.getKey()+" : "+m.getValue());
			}
		}
	
	
	
	
	
	
	
	
	}
	
	
	
	
	

}
