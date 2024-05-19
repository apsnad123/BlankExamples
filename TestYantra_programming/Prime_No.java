package TestYantra_programming;

public class Prime_No {
	
	
	static boolean isPrime(int n) {
		 int c=0;
		 for(int i=1; i<=n; i++) {
			 if(n%i==0) {
				 c++;
			 }
		 }
		 return c==2;
	 }

	public static void main(String[] args) {

		int n=30;
		for(int i=1;i<=n;i++) {
			if(isPrime(i)) {
			System.out.println(i);
		}
		}	
	}


}
