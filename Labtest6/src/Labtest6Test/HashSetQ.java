package Labtest6Test;

import java.util.HashSet;

public class HashSetQ {
	//main Method..
	public static void main(String[] args) {
		//calling numberofelements method....
		numberofelements();
		
	}
	
	//numberofelements method....
	public static void numberofelements(){
		//creating Hashset...
		HashSet<Integer>h=new HashSet<>();
		//adding element in hashset...
		h.add(22);
		h.add(2);
		h.add(99);
		h.add(88);

		
		System.out.println("NO of element present in hashset is:"+h.size());
		
	}


}
