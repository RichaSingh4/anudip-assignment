package Labtest6Test;

import java.util.ArrayList;

public class RemoveElement {

	
	//main method....
	public static void main(String[] args) {
		//Calling method colorarray..
		Remove();
		

	}
	
	//colorarray method ..
	public static void Remove() {
		//Creating arraylist colors..
		ArrayList<String> colors=new ArrayList<>();
		
		//Adding elements into list..
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Magenta");
		colors.add("Blue");
		
		System.out.println("array list before removal of 3rd element:");
		
		//for each loop for iterating in arraylist...
		//and then printing the colors..
		for(String c: colors) {
			System.out.println(c);
		}
		
		//remove used to remove the element from arraylist.
		colors.remove(3);
		System.out.println("array list after removal of 3rd element:");
		for(String c: colors) {
			System.out.println(c);
		}
		
		
	}
	
	

}
