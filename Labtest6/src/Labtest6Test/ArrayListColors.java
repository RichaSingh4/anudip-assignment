package Labtest6Test;

import java.util.ArrayList;

public class ArrayListColors {
	
	//main method....
	public static void main(String[] args) {
		//Calling method colorarray..
		colorarray();
		

	}
	
	//colorarray method ..
	public static void colorarray() {
		//Creating arraylist colors..
		ArrayList<String> colors=new ArrayList<>();
		
		//Adding elements into list..
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Magenta");
		colors.add("Blue");
		
		System.out.println("Colors in the array list are:");
		
		//for each loop for iterating in arraylist...
		//and then printing the colors..
		for(String c: colors) {
			System.out.println(c);
		}
		
		
	}

}
