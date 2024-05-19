package TestYantra_programming;

import org.testng.annotations.Test;

public class Print_Character_number_specialCharacter {

	@Test
	public static void main(String[] args) {
		String s="@#$aer123AU";
		//o/p:  aerAU  123  @#$
		
		String character=" ";
		String num=" ";
		String special_char=" ";
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z') {
			character=character+s.charAt(i)	;
			}else if (s.charAt(i)>='0' && s.charAt(i)<='9') {
				num=num+s.charAt(i)	;
			}else {
				special_char=special_char+s.charAt(i);	
			}
		}
		
		System.out.print(character +" "+num+" "+special_char);

	}

}
