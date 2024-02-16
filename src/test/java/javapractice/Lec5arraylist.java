package javapractice;

import java.util.ArrayList;

public class Lec5arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	/*ArrayList - we can store multiple data in single variable
	 * ArrayList is not fixed, we can add, remove,
	 * replace according to requirements 	
	 */
		
		
	ArrayList <String>	cars=new ArrayList <String>();
		
	//how to add value in ArrayList 
	 
cars.add("BMW");
cars.add("nissan");
cars.add("ford");	
cars.add("musstang");
cars.add("toyota");		
		
	//how to access item in ArrayList

cars.get(2);
cars.get(0);	
		
	//how to change item in ArrayList
cars.set(1, "bently");
		
	//how to remove item 	
		
		cars.remove(3);
		
		
	System.out.println(cars);	
		
		
	//Add value in ArrayList
	
	
	//how to add item in ArrayList
	
	ArrayList <String> companies= new ArrayList <String>();
	
	//how to add item in ArrayList
	
	companies.add("amazon");
	companies.add("apple");
	companies.add("google");
	companies.add("facebook");
	companies.add("microsoft");
	
	
	//How to access item in ArrayList

	companies.get(2);
	companies.get(3);
		
	// how to change item in ArrayList
	companies.set(0, "intragram");
		
	//remove item in ArrayList
	companies.remove(3);
		
	
	System.out.println(companies);
	
	
	ArrayList<Integer>mark = new ArrayList <Integer>(); //Create an ArrayList object
	
	
	//how to add value in ArrayList
	
	mark.add(25);
	mark.add(27);
	mark.add(45);
	mark.add(87);
	mark.add(69);
	mark.add(90);
	
	
	// how to access item in ArrayList
	
	mark.get(2);
	mark.get(4);
	
	// how to change item in ArrayList 
	
	mark.set(0, 22);
	
	//how to remove item in ArrayList
	
	mark.remove(5);
	
	
	System.out.println(mark);
	
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
