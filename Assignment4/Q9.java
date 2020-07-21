//retrieve an element from a particular position of an ArrayList
import java.util.*; 
  
public class Q9 { 
    public static void main(String args[]) 
    { 
  

	 ArrayList<Integer> num1 = new ArrayList<Integer>(); 
	
	num1.add(10);
	num1.add(20);
	num1.add(30);
	num1.add(40);
	num1.add(50);
	
	
	int value=num1.get(3);
	System.out.println("Retrieved element is :" + value);
     
	
    } 
} 