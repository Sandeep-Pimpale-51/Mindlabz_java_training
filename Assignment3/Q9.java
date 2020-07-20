// How to find all permutations of String?
import java.util.*;

class Q9

{

 static void printPermutn(String str, String ans) 
    { 
  
        // If string is empty 
        if (str.length() == 0) { 
            System.out.print(ans + " "); 
            return; 
        } 
  
        for (int i = 0; i < str.length(); i++) { 
  
            // ith character of str 
            char ch = str.charAt(i); 
  
            // Rest of the string after excluding  
            // the ith character 
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
  
            // Recurvise call 
            printPermutn(ros, ans + ch); 
        } 
    } 	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);	
		System.out.println("\nEnter the String::");
		String s=sc.nextLine();			
		
		printPermutn(s, ""); 
		
	}				
			
}