package TestYantra_programming;

import java.util.Iterator;

import org.testng.annotations.Test;

public class  DONE4_AddingOfArray {

	@Test
	public void adding1() {
		int a[]= {2,5,1,4};
		int b[]= {3,4,3,2,3};
		int length=a.length;
		if (a.length<b.length) {
			length=b.length;
		}
		
		for (int i = 0; i < length; i++) {
			try {
				System.out.println(a[i]+b[i]+" ");
			} catch (Exception e) {
				// TODO: handle exception
				
				if (a.length<b.length) {
					System.out.println(b[i]);
				}else {
					System.out.println(a[i]);
				}
			}
		}
	}
			//-------------------------------------------
			@Test
			public void adding2() {
				int a[]= {2,5,1,4,3};
				int b[]= {3,4,3,2};
				int length=a.length;
				if (a.length<b.length) {
					length=b.length;
				}
				
				for (int i = 0; i < length; i++) {
					try {
						System.out.println(a[i]+b[i]+" ");
					} catch (Exception e) {
						// TODO: handle exception
						
						if (a.length<b.length) {
							System.out.println(b[i]);
						}else {
							System.out.println(a[i]);
						}
					}
		}
	}

}
