package TestYantra_programming;

import java.util.Iterator;

import org.testng.annotations.Test;

public class Reverse_the_word {

	@Test
	public void reverse_of_Character1()  {
		String s="Banglore";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}

	@Test
	public void reverse_of_Character2() {
		String s="Banglore";
		char[] st = s.toCharArray();
		for(int i=st.length-1;i>=0;i--) {
			System.out.print(st[i]);
		}
	}
	
	@Test
	public void reverse_of_Character3() {
		String s="Banglore";
		String rev=" ";
		for (int i = s.length()-1; i >= 0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}
