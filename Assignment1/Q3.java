// program that prompts the user to input a positive integer. It should then print the multiplication table of that number.

import java.util.*;
class Q3{

	public static void main(String args[])
	{
		int num,res=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println("Multiplication table::");
			for(int i=1;i<=10;i++)
			{
				res=num*i;	
				System.out.println(res);
			}	
		}
		else
			System.out.println("Please Enter the Positive number.");
		

	}
}