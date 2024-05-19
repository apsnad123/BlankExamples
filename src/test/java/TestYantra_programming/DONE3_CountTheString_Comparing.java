package TestYantra_programming;

import java.util.Iterator;

import org.testng.annotations.Test;

public class DONE3_CountTheString_Comparing {

	public static void main(String[] args) {
		//print minimum
		String[] s= {"rty","yuiot","wer","er"};
		String mini_length = s[0];
	for (int i = 0; i < s.length; i++) {
		if (s[i].length()< mini_length.length()) {
		mini_length=s[i];	
		}
	}
System.out.println(mini_length);
	}
	
	@Test
	public void minimum2() {
		String a[]= {"rty","yu","erty","io"};
		String mini_String=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i].length()<mini_String.length() ) {
				mini_String=a[i];
			}
		}
		
		for (int j = 0; j < a.length; j++) {
			if (a[j].length()==mini_String.length()) {
				System.out.println(a[j]);
			}
		}
	}
	
	
	@Test
	public void maximum1() {
		
		String[] s= {"rty","yuiot","wer","er","yuioy"};
		String max = s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i].length()>max.length()) {
				max=s[i];
			}
		}
     for (int j = 0; j < s.length; j++) {
		if (s[j].length()==max.length()) {
			System.out.println(s[j]);
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
