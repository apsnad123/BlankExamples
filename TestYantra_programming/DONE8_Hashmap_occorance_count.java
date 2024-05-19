package TestYantra_programming;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class DONE8_Hashmap_occorance_count {

	public static void main(String[] args) {
	
		String str = "aabbabcABC";
		String s = str.toLowerCase();
		char[] ch = s.toCharArray();
		//o/p: a4b4c2
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(ch[i])) {
				map.put(ch[i],map.get(ch[i])+1);
			}else {
				map.put(ch[i], 1);
			}	
		}
		for(Entry<Character, Integer> m:map.entrySet()) {
				System.out.print(m.getKey()+""+m.getValue());	
		}
	}
	
	@Test
	public void name() {
		String s="aabbabcc";
		//o/p:a2b2a1b1c1
		int count=1;
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i)==s.charAt(i+1)) {
				count++;
			}else {
				System.out.print(s.charAt(i)+""+count);
				count=1;
			}
		}
		System.out.print(s.charAt(s.length()-1)+""+count);
	}
	
	@Test
	public void count() {
	String s="In d ia";
	String r = s.replace(" ", "");
	int count=0;
	for (int i = 0; i < r.length(); i++) {
	count++;	
	}
	System.out.println(count);
	}
	
	@Test
	public void count1() {
	String s="In d ia";
	int count=0;
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)!=' ') {
			count++;
		}
		
	}
	System.out.println(count);
	}
	
	

}
