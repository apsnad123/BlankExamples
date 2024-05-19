package TestYantra_programming;

import java.util.Iterator;

import org.testng.annotations.Test;

public class DONE7_H_e__l___l____o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="hello";
		
		char[] st = s.toCharArray();
		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i]);
			for (int j = 0; j <=i; j++) {
				System.out.print("_");
			}
		}	
	}
	
	@Test
	public void name() {
		String s="hello";
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
			for (int j = 0; j <=i; j++) {
				System.out.print(".");
			}
		
	}	
	}
		

}
