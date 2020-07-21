//join two ArrayLists

import java.util.*; 
  
public class Q17 { 
    public static void main(String args[]) 
    { 
  

	 ArrayList<String> str1= new ArrayList<String>(); 
	
	str1.add("Sandy");
	str1.add("Sandip");
	str1.add("Sandy");
	
	
	System.out.println("\n ArrayList1 :" + str1);

	ArrayList<String> str2= new ArrayList<String>(); 
	
	str2.add("Sandesh");
	str2.add("sagar");
	
	System.out.println("\n ArrayList2 :" + str2);
	
	str1.addAll(str2);
	
	System.out.println("\n Elements after appending ArrayList 2 AT End of ArrayList1 :" + str1);

	
    } 
} 