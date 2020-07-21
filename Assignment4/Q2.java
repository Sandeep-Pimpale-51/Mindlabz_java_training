//increase the current capacity of an ArrayList
import java.util.*; 
  
public class Q2 { 
    public static void main(String args[]) 
    { 
  
        // create a ArrayList1 
        ArrayList<String> str1 = new ArrayList<String>(5); 
  
        // Initialize an ArrayList with add() 
        str1.add("one"); 
        str1.add("two"); 
        str1.add("Three"); 
  
	str1.ensureCapacity(7);
	 str1.add("Four"); 
        str1.add("Five"); 
        str1.add("Six"); 

        // print ArrayList 
        System.out.println("ArrayList1 : " + str1); 



    } 
} 