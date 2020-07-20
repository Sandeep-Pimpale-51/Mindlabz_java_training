//1) How to Print duplicate characters from String?

import java.util.*;

class Q1
{
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the String::");
		String str=sc.nextLine();			
		
		System.out.println("Duplicate Characters are:: ");
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					System.out.println(str.charAt(j));
					break;
				}
			}
		}
							
		
	}
}