package TestYantra_programming;

import java.util.HashMap;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Vowels {
	
	@Test
	public void vowel1() {
		String name="India";
		String st = name.toLowerCase();
		char[] str = st.toCharArray();
		int count=0;
		for (int i = 0; i < str.length; i++) {
			if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u') {
				count++;
				System.out.println(str[i]);
			}
		}
		System.out.println(count);
	}
	
	@Test
	public void vowel2() {
	String name="India";
	String st=name.toLowerCase();
	
	LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	for (int i = 0; i < st.length(); i++) {
		set.add(st.charAt(i));
	}
	
	int count=0;
	for (Character ch : set) {
		if (ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u' ) {
			count++;
			System.out.println(ch);
		}
	}
	System.out.println(count);
	}
}
