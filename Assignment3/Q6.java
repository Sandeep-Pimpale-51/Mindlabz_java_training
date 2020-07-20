//How to count a number of vowels and consonants in a String?
import java.util.*;

class Q6
{
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the String::");
		String str=sc.nextLine();			
		
		String vowels="aeiou";

		int vowel=0,cons=0,flag=0;
		System.out.println("String have:: ");
		for(int i=0;i<str.length();i++)
		{
			flag=0;
			for(int j=0;j<vowels.length();j++)
			{
				if(str.charAt(i)==vowels.charAt(j))
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				vowel=vowel+1;

			}
			else
			if(flag==0)
			{
				cons=cons+1;
			}
		}					
	
		System.out.println("Vowels ::"+vowel+"\nconsonants ::"+cons);	
	}
}