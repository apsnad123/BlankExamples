package TestYantra_programming;

import org.testng.annotations.Test;

public class DONE9_maximum_minimum_no_withoutBubbleSort {
	
	@Test
	public void minimum_no() {
		int a[]= {5,3,0,4,1};
		int fMin=a[0];
		for (int i = 0; i < a.length; i++) {
			if(fMin>a[i]) {
				fMin=a[i];
			}
		}
		System.out.println(fMin);
	}
	
	@Test
	public void maximum_no() {
		int a[]= {5,3,0,4,1};
		int fMax=a[0];
		for (int i = 0; i < a.length; i++) {
			if(fMax<a[i]) {
				fMax=a[i];
			}
		}
		System.out.println(fMax);
	}

}
