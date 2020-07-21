// check whether the given element is present in an ArrayList or not
import java.util.*; 
  
public class Q6 { 
    public static void main(String args[]) 
    { 
  

	 ArrayList<String> str2 = new ArrayList<String>(); 
	
	str2.add("Sandy");
	str2.add("Mandy");
	str2.add("Candy");
	str2.add("Sandip");
	str2.add("Sandesh");
	
	boolean has=str2.contains("Sandip");
	if(has==true)
	{     
        	System.out.println("\nElement is Present"); 

	}
	else
	{
		System.out.println("\nElement is Not Present"); 
	}

	
    } 
} 