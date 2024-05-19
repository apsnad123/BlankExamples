package TestYantra_programming;

import org.testng.annotations.Test;

public class DONE1_Counting {
	
	@Test
	public void count() {
		String s="Ae173@09";
		//o/p=20
		
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>='0' && s.charAt(i)<='9') {
				int n = s.charAt(i)-48;
				sum=sum+n;
			}
		}
		System.out.println(sum);
	}

}
