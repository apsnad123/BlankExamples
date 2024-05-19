package TestYantra_programming;

public class ReversingOnlyStringNotCharacter {

	public static void main(String[] args) {
		String s="h&el$l%o9";
		//o/p: 9&ol$l%eh
		 String s1 = s.replaceAll("[^A-Za-z0-9]","");
		 int c = s1.length()-1;
		 for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>='a' &&s.charAt(i)<='z' || s.charAt(i)>='0' &&s.charAt(i)<='9' ) {
				System.out.print(s1.charAt(c--));
			}else {
				System.out.print(s.charAt(i));
			}
		}
		
		
		
	}

}
