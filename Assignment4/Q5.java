//find out whether the given ArrayList is empty or not
import java.util.*; 
  
public class Q5 { 
    public static void main(String args[]) 
    { 
  
        // Using isEmpty () 
        ArrayList<String> str1 = new ArrayList<String>(); 
  
	System.out.println("\nUsing isEmpty () : "); 

	boolean empty=str1.isEmpty();	
       
  	if(empty==true)
	{     
        	System.out.println("\nArrayList1 is Empty"); 

	}
	else
	{
		System.out.println("\nArrayList1 is not Empty"); 
	}

	
	//Using Size() 
	
	System.out.println("\nUsing size () : "); 

	 ArrayList<String> str2 = new ArrayList<String>(); 
	
	str2.add("Sandy");
	
	int size=str2.size();
	if(size==0)
	{     
        	System.out.println("\nArrayList2 is Empty"); 

	}
	else
	{
		System.out.println("\nArrayList2 is not Empty"); 
	}

	
    } 
} 