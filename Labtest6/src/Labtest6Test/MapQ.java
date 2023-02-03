package Labtest6Test;

import java.util.HashMap;
import java.util.Map;

public class MapQ {
	//main method..
	public static void main(String args[]) {
//		calling count Method...
		count();
		
	}
	public static void count() {
		//Creating Map..
		Map<Integer,String> hm=new HashMap<>();
		//adding element..
		hm.put(1, "ek");
		hm.put(2, "do");
		hm.put(3, "teen");
		hm.put(4, "char");
		hm.put(5, "panch");
		//printing size/count of key-value pair in map... 
		System.out.println("Total key-value pair is:"+hm.size());
	}

}
