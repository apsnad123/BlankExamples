package TestYantra_programming;

import org.testng.annotations.Test;

public class DONE2_CountTheNumber_Comparing {
	
	
	@Test
	public void name() {
	String a[]= {"1234","123","12","1","4"}	;
	String min = a[0];
	String max= a[0];
	for (int i = 0; i < a.length; i++) {
		if (a[i].length()<min.length()) {
			min=a[i];
		}
		else if (a[i].length()>max.length()) {
			max=a[i];
		}
	}
	System.out.println("maximum"+max+"minimum"+min);
	}
	


}
