//2) How to check if two Strings are anagrams of each other?
import java.util.*;

class Q2
{
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);	
		System.out.println("\nEnter the String1::");
		String str1=sc.nextLine();			
		
		System.out.println("\nEnter the String::");
		String str2=sc.nextLine();

		
		int l1=str1.length();
		int l2=str2.length();
		
		int count=0;
		if(l1==l2)
		{
			for(int i=0;i<l1;i++)
			{
				for(int j=0;j<l2;j++)
				{
					
					if(Character.toLowerCase(str1.charAt(i))==Character.toLowerCase(str2.charAt(j)))
					{
						count=count+1;
						break;
					}
				}
			}
			if(count ==l1)
			{
				System.out.println("\n Strings are anagrams of each other.");
			}
			else
				{
					System.out.println("\n Strings are not anagrams of each other");
				}				
		}	
		else
			{
				System.out.println("\n String lenghts are Different");
			}

	}
}