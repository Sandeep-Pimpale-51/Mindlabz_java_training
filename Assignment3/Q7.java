//How to count the occurrence of a given character in String?
import java.util.*;

class Q7
{
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the String::");
		String str=sc.nextLine();

		System.out.println("Enter the charcter::");
		char c=sc.next().charAt(0);			
		
		int count=0;
		System.out.println("Answer:: ");
		for(int i=0;i<str.length();i++)
		{
				if(str.charAt(i)==c)
				{
					count=count+1;
					
				}
			
		}
			if(count==0)
			{
				System.out.println("character not found");
			}
			else
			{
				System.out.println(c+":"+count);
			}				
		
	}
}