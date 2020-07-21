//append an element at the end of an ArrayList
import java.util.*; 
  
public class Q11 { 
    public static void main(String args[]) 
    { 
  

	 ArrayList<Integer> num1 = new ArrayList<Integer>(); 
	
	num1.add(10);
	num1.add(20);
	num1.add(30);
	num1.add(40);
	num1.add(50);
	
	System.out.println("\nBefore appending elements Are :" + num1);

	num1.add(60);
	System.out.println("\nAfter appending elements Are :" + num1);
     
	
    } 
} 