//different ways of constructing an ArrayList?

import java.util.*; 
  
public class Q1 { 
    public static void main(String args[]) 
    { 
  
        // create a ArrayList1 
        ArrayList<String> str1 = new ArrayList<String>(); 
  
        // Initialize an ArrayList with add() 
        str1.add("one"); 
        str1.add("two"); 
        str1.add("Three"); 
  
        // print ArrayList 
        System.out.println("ArrayList1 : " + str1); 


	 // create a ArrayList2 
        ArrayList<String> str2 = new ArrayList<String>(){ 
  
       		{ // Initialize an ArrayList with add() 
       		add("one"); 
        	add("two"); 
        	add("Three"); 
 		}
	 };
        // print ArrayList 
        System.out.println("ArrayList2 : " + str2);
	
	  // create a ArrayList3
        ArrayList<String> str3 = new ArrayList<String>(Arrays.asList("one","two","Three")); 
        // print ArrayList 
        System.out.println("ArrayList3 : " + str3);

	 // create a ArrayList4
        
	List<String> str4 = new ArrayList<>(List.of("one","two","Three")); 
       
	 // print ArrayList 
        System.out.println("ArrayList4 : " + str4);

	 // create a ArrayList4
        
	List<String> str5 = new ArrayList<>(); 
	
	str5.add("one");
	str5.add("two");
	str5.add("Three");
       
	 // print ArrayList 
        System.out.println("ArrayList5 : " + str5);
	
	 

    } 
} 