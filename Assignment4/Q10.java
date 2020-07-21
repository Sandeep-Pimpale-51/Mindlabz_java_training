//replace a particular element in an ArrayList with the given element?
import java.util.*; 
  
public class Q10 { 
    public static void main(String args[]) 
    { 
  

	 ArrayList<Integer> num1 = new ArrayList<Integer>(); 
	
	num1.add(10);
	num1.add(20);
	num1.add(30);
	num1.add(40);
	num1.add(50);
	
	System.out.println("\nBefore replacing elements Are :" + num1);

	int value=num1.set(3,45);
	System.out.println("\nAfter replacing elements Are :" + num1);
     
	
    } 
} 