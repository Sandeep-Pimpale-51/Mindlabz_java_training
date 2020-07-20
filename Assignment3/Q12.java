//How to return the highest occurred character in a String?
import java.util.*;

class Q12
{
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the String::");
		String str=sc.nextLine();	
		char res=' ';
		int count=1,flag=0,j=0,lastCount=1,max=1;
		System.out.println();
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
					
				}
			}
			if(flag==1)
			{
				if(max<=count)
				{
					
					max=count;
					res=str.charAt(i);
					lastCount=count;	
				}
				lastCount=count;
			}
		}	
		System.out.println(res+":"+max);				
		
	}
}