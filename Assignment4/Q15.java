//remove all elements of an ArrayList at a time?

import java.util.*; 
  
public class Q15 { 
    public static void main(String args[]) 
    { 
  

	 ArrayList<String> str1= new ArrayList<String>(); 
	
	str1.add("Sandy");
	str1.add("Sandip");
	str1.add("Sandy");
	str1.add("Sandesh");
	str1.add("sagar");
	
	System.out.println("\nBefore removing elements Are :" + str1);

	str1.clear();
	System.out.println("\nAfter removing elements Are :" + str1);
     
	
    } 
} 