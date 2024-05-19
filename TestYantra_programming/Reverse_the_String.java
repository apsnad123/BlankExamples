package TestYantra_programming;

import java.util.Iterator;

import org.testng.annotations.Test;

public class Reverse_the_String {

	
	@Test
	public void reverse_string2() {
		//o/p=aparnaisnamemyhello
		String s=" hello my name is aparna";
		String[] rev = s.split(" ");
		for(int i=rev.length-1;i>=0;i--) {
			System.out.print(rev[i]);
		}
	}
	
	
	@Test
	public void reverse_and_swapping() {
		
		//o/p=aparna my name is hello
		String s="hello my name is aparna";
		String[] st = s.split(" ");
		String temp=st[0];
		st[0]=st[st.length-1];
		st[st.length-1]=temp;
		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i]+" ");;		
		}			
	}
	
	@Test
	public void reverse_and_swapping_rereversing() {	
		//o/p=olleh ym eman si anrapa
		
		String s="hello my name is aparna";
		String[] st = s.split(" ");
		
		for (int i = 0; i < st.length; i++) {
			String str = st[i];
			for(int j=str.length()-1;j>=0;j--) {
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}	
	}

	@Test
	public void reverse_and_swapping_rereversing2() {	
	
		String st="Hi Hello Welcome";
		//o/p: em ocleW olleHiH
		String s = st.replace(" ", "");
		int j = s.length()-1;
		
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i)!=' ') {
				System.out.print(s.charAt(j--));
			}else {
				System.out.print(st.charAt(i));
			}
		}
		
	}
}
