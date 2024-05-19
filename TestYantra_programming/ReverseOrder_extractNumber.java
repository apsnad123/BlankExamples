package TestYantra_programming;

import org.testng.annotations.Test;

public class ReverseOrder_extractNumber {
	
	@Test
	public void name() {
		//o/p: 6789 5 45 1234
		String s="abcd1234bd45ef5gh6789";
		String[] st = s.split("[^0-9]");
		for (int i = st.length-1; i >=0; i--) {
			System.out.print(st[i]+" ");
		}
	}
		@Test
		public void name1() {
			//o/p: abcd    bd  ef gh
			String s="abcd1234bd45ef5gh6789";
			String[] st = s.split("[^A-Za-z]");
			for (int i = 0; i<st.length; i++) {
				System.out.print(st[i]+" ");
			}
		
	}

}
