package Labtest6Test;

import java.util.ArrayList;
import java.util.Collections;

public class Swapping {
	//main method..
	public static void main(String[] args) {
		//calling swapping method..
		swapping();
		
	}
	
	//swapping method..
	public static void swapping() {
		///creating two arraylist...
		ArrayList<Integer> num1=new ArrayList<>();
		ArrayList<Integer> num2=new ArrayList<>();
		//adding elements in num1 and num2..
		num1.add(88);
		num1.add(23);
		num1.add(30);
		num1.add(40);
		num2.add(54);
		num2.add(64);
		num2.add(73);
		num2.add(83);
		System.out.println("Before Swapping num1 is:");
	//for each loop to print elements before swapping..
		for(Integer n: num1) {
			System.out.println(n);
		}
		
		//using swap method from collections class....
		Collections.swap(num1,2,3);
		
		//for each loop to print elements after swapping..
		System.out.println("After Swapping index 2 and 3 , num1 is:");
		for(Integer n: num1) {
			System.out.println(n);
		}
		//for each loop to print elements before swapping..
		System.out.println("Before Swapping num2 is:");
		for(Integer n: num2) {
			System.out.println(n);
		}
		//calling swap method from collections class..
		Collections.swap(num2,3,2);
		
		//for each loop to print elements after swapping..
		System.out.println("After Swapping index 2 and 3 , num2 is:");
		for(Integer n: num2) {
			System.out.println(n);
		}
	}

}
