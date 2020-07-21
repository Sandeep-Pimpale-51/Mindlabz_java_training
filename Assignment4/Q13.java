//remove an element from a particular position of an ArrayList?

import java.util.*; 
  
public class Q13 { 
    public static void main(String args[]) 
    { 
  

	 ArrayList<Integer> num1 = new ArrayList<Integer>(); 
	
	num1.add(10);
	num1.add(20);
	num1.add(30);
	num1.add(40);
	num1.add(50);
	
	System.out.println("\nBefore removing elements Are :" + num1);

	num1.remove(3);
	System.out.println("\nAfter removing elements Are :" + num1);
     
	
    } 
} 