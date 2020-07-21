//convert an ArrayList to Array
import java.util.*; 
  
public class Q8 { 
    public static void main(String args[]) 
    { 
  

	 ArrayList<Integer> str2 = new ArrayList<Integer>(); 
	
	str2.add(10);
	str2.add(20);
	str2.add(30);
	str2.add(40);
	str2.add(50);
	
	Object[] arr=str2.toArray();
	
	for (Object value : arr) {
         System.out.println("Number = " + value);
      }
	
    } 
} 