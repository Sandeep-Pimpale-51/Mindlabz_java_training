//retrieve a portion of an ArrayList?

import java.util.*; 
  
public class Q16 { 
    public static void main(String args[]) 
    { 
  

	 ArrayList<String> str1= new ArrayList<String>(); 
	
	str1.add("Sandy");
	str1.add("Sandip");
	str1.add("Sandy");
	str1.add("Sandesh");
	str1.add("sagar");
	
	System.out.println("\nOriginal ArrayList :" + str1);

	List<String> str2=str1.subList(2,4);
	System.out.println("\nSubList :" + str2);
     
	
    } 
} 