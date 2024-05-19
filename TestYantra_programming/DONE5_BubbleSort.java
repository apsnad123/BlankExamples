package TestYantra_programming;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.Test;

public class  DONE5_BubbleSort {

	public static void main(String[] args) {
		int a[]= {5,3,0,4,1};
		//ascending
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print((a[i]));
		}
	}

	@Test
	public void descending() {
    int a[]= {5,3,0,4,1};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print((a[i]));
		}
	}
	
	@Test
	public void sumOf3MaxNo() {
      int a[]= {5,3,0,4,1};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int sum=0;
		for (int i = 0; i <3; i++) {
		sum=sum+a[i];	
		}
		System.out.print(sum);
	}
	
	@Test
	public void sumOf3MinNo() {
      int a[]= {5,3,0,4,1};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int sum=0;
		for (int i = 0; i <3; i++) {
		sum=sum+a[i];	
		}
		System.out.print(sum);
	}
	
	@Test
	public void proOf3MaxNo() {
      int a[]= {5,3,0,4,1};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int pro=1;
		for (int i = 0; i <3; i++) {
			pro=pro*a[i];	
		}
		System.out.print(pro);
	}
	
	@Test
	public void proOf3MinNo() {
      int a[]= {5,3,0,4,1};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int pro=1;
		for (int i = 0; i <3; i++) {
			pro=pro*a[i];	
		}
		System.out.print(pro);
	}
	
	@Test
	public void FirstMin() {
    int a[]= {5,3,0,4,1};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print((a[0]));
	}
	
	@Test
	public void FirstMax() {
    int a[]= {5,3,0,4,1};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print((a[0]));
	}
}
