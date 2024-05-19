package TestYantra_programming;

import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.Test;

public class DONE910_HashMap_Occurance_number {

	public static void main(String[] args) {
		

		int a[]= {1,2,4,1,5,2};
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i= 0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		System.out.println(map);
	}
	
	@Test
	public void HashMap_Occurance_question_duplicate_values() {
		int a[]= {1,2,3,1,2,3,4,5};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		for(Entry<Integer, Integer>m:map.entrySet()) {
			if (m.getValue()>1) {
				System.out.println(m.getKey()+" : "+ m.getValue());
			}
		}
	}
	
	
	//---------------------------------------------
	
	@Test
	public void HashMap_Occurance_question_unique_number() {
		// TODO Auto-generated method stub

		int a[]= {1,2,4,2,1,4,5,6,8};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		
	for(Entry<Integer, Integer>m:map.entrySet()) {
		if (m.getValue()==1) {
			System.out.println(m.getKey()+" : "+ m.getValue());
		}
	}

	} 
}
  
