package TestYantra_programming;

import java.util.Iterator;

public class CheckTheGvenNoIsPrimeorNot {
	

	public static void main(String[] args) {

		
		int n=7,c=0;
		for (int i = 1; i < n; i++) {
			if (n%i==0) {
				c++;
			}
		}
		System.out.println(c==2?n+" Prime No":n+" notPrime No");
	}

}
