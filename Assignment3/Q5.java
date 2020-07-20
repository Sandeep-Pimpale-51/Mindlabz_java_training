//How to find duplicate characters in a String?
import java.util.*;

class Q5
{
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the String::");
		String str=sc.nextLine();			
		
		int count=1,flag=0,j=0;
		System.out.println("Duplicate Characters are:: ");
		for(int i=0;i<str.length();i++)
		{
			count=1;
			flag=0;
			for( j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					flag=1;						
					count=count+1;
					break;
				}
			}
			if(flag==1)
			{
			System.out.println(str.charAt(j)+":"+count);
			

			}
		}					
		
	}
}