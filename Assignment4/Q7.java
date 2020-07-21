//get the position of a particular element in an ArrayList?
import java.util.*; 
  
public class Q7 { 
    public static void main(String args[]) 
    { 
  

	 ArrayList<String> str2 = new ArrayList<String>(); 
	
	str2.add("Sandy");
	str2.add("Mandy");
	str2.add("Sandy");
	str2.add("Sandip");
	str2.add("Sandesh");
	
	int i1=str2.indexOf("Sandy");
	
	System.out.println("\nFirst Occurance of Element Sandy is at :"+i1); 

	
	int i2=str2.lastIndexOf("Sandy");
	
	System.out.println("\nLast Occurance of Element Sandy is at :"+i2); 

	
    } 
} 