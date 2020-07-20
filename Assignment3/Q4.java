// How to reverse String in Java using Iteration and Recursion?

import java.util.*;

 class Q4 {

   		public static void main(String[] args) 
		{

    			 Scanner sc=new Scanner(System.in);	
			 System.out.println("\nEnter the String::");
			 String str=sc.nextLine();

   			 String newStr =" ";

    			  for(int i = str.length()-1; i >= 0 ; i--) 
			{
         			newStr = newStr+str.charAt(i);
      			}

      			System.out.println("reversed: "+newStr);
   			}
		}