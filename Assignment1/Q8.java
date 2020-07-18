//program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number. 

import java.util.*;
class Q8{

	public static void main(String args[])
	{
		int num,flag=0;
		
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();

		if(num>0)
		{
			int mid=num/2;
			
			if(num==1)
			{
				
				System.out.println("The Number "+num+" is Not Prime Number.");
			}
			else
			{
				for(int i=2;i<=mid;i++)
				{
					if(num%i==0)
					{
						flag=1;
						break;	
					}
					else
					{
						flag=0;
					
					}	
				}
			
			if(flag==1)
				System.out.println("The Number "+num+" is Not Prime Number.");
			else
				System.out.println("The Number "+num+" is Prime Number.");	
			}
		}
		else
			System.out.println("Kindly Enter the positive number !!!");
	
	}
}