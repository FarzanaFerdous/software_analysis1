package javapractice;

import java.util.HashMap;

import javax.print.DocFlavor.STRING;

public class Lec6HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//Store 4 city in	
		
		
	
		
		//HashMap
	
	//Store 4 citHashMap<K, V>tate
	//store data in HashMap
		
	HashMap<String,String>citystate= new HashMap<String, String>();	
	
		//put mathod
	
		citystate.put("Dallas", "TX");;
		citystate.put("NYC", "NY");
		citystate.put("la", "CA");
		
		//access item
		
		//get mathod
		
		System.out.println(citystate.get("NYC"));
		System.out.println(citystate.get("Dallas"));
		System.out.println(citystate.get("la"));
		
		
		//remove an item
		
		System.out.println(citystate.remove("NYC"));
		System.out.println(citystate);
		
		
		//size 
		
		System.out.println(citystate.size());
		
		
		
		
		
		
		
	//8 zipcode and city
		
	HashMap <Integer,String>zipcodecity= new HashMap <Integer, String>();
	
	//put method
	
    zipcodecity.put(92337, "fontana");
	zipcodecity.put(75846, "Rancho");
	zipcodecity.put(65825, "iverlad");
	zipcodecity.put(98584, "corona");
	zipcodecity.put(75894, "highland");
	zipcodecity.put(35586, "riverside");
	zipcodecity.put(61254, "pasedina");
	zipcodecity.put(69128, "irvine");
	
	//access item
	 

	//get method
	
	System.out.println(zipcodecity.get(98584));
	System.out.println(zipcodecity.get(35586));
	System.out.println(zipcodecity.get(75846));
	
		
	//remove item
	
	System.out.println(zipcodecity.remove(69128));
		System.out.println(zipcodecity);
		
	System.out.println(zipcodecity.remove(35586));
		System.out.println(zipcodecity);
		
		
		
		
	//size method
		System.out.println(zipcodecity.size());
		
		
		
		
		
	//12 student name and their ID
		
		HashMap <String, Integer>studentID= new HashMap<String, Integer>();
		
		//put method
		
		studentID.put("John", 5698);
		studentID.put("Tuhin", 5894);
		studentID.put("Raisa", 3652);
		studentID.put("Sadia", 1452);
		studentID.put("Jaiyana", 4586);
		studentID.put("Pranto", 6584);
		studentID.put("Ifty", 9854);
		studentID.put("Mahin", 2547);
		studentID.put("Daniel", 8579);
		studentID.put("Mukit", 5203);
		studentID.put("Mark", 2360);
		studentID.put("jenifer", 4065);
		
		
		//access an item
		
		//get method
		
		System.out.println(studentID.get("Raisa"));
		
		
		System.out.println(studentID.get("Mahin"));
	   
		System.out.println(studentID.get("Daniel")); 
		
		//remove an item
		
		System.out.println(studentID.remove("Mukit"));
		System.out.println(studentID);
		
		
		System.out.println(studentID.remove("Mahin"));
		System.out.println(studentID);
		
		
		//size 
		

		System.out.println(studentID.size());
		
		
	//6 employee name and salary	
		
		
		HashMap<String, Double>paycheck=new HashMap<String, Double>();
		
		//put method
		
	paycheck.put("Jack",95.25);
	paycheck.put("Joshep",85.00);
	paycheck.put("Anny",55.74);
	paycheck.put("Robert",65.98);
	paycheck.put("Jacky",75.28);
	paycheck.put("Jeni",95.25);
		
		//Access an item
	
		//get method
		
		System.out.println(paycheck.get("Anny"));
		System.out.println(paycheck.get("Jacky"));
		
	
		//remove an item
		System.out.println(paycheck.remove("Jeni"));
		System.out.println(paycheck);
		
		System.out.println(paycheck.remove("Jack"));
		System.out.println(paycheck);
		
		
		
		//size 
		
		System.out.println(paycheck.size());
		
		
		
		
		
		
		
	}

}
