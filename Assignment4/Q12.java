//insert an element at a particular position of an ArrayList?

import java.util.*; 
  
public class Q12 { 
    public static void main(String args[]) 
    { 
  

	 ArrayList<Integer> num1 = new ArrayList<Integer>(); 
	
	num1.add(10);
	num1.add(20);
	num1.add(30);
	num1.add(40);
	num1.add(50);
	
	System.out.println("\nBefore appending elements Are :" + num1);

	num1.add(3,60);
	System.out.println("\nAfter appending at 3rd index elements Are :" + num1);
     
	
    } 
} 