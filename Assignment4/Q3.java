//decrease the current capacity of an ArrayList to the current size
import java.util.*; 
  
public class Q3 { 
    public static void main(String args[]) 
    { 
  
        // create a ArrayList1 
        ArrayList<String> str1 = new ArrayList<String>(5); 
  
	
        // Initialize an ArrayList with add() 
        str1.add("one"); 
        str1.add("two"); 
        str1.add("Three"); 
  
	str1.trimToSize();

        // print ArrayList 
        System.out.println("ArrayList1 : " + str1+" With Size "+str1.size()); 



    } 
} 