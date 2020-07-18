// program to Compute the natural logarithm of 2, by adding up to n terms in the series.1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n .where n is a positive integer and input by user.

import java.util.*;
class Q16{

	public static void main(String args[])
	{
		int num,sign=1;
		float sum=0;
		
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the Number");
		num=sc.nextInt();
		
		if(num>0)
		{
		 	for (int i = 1; i <= num; i++) 
			{
         	 		 sum += (1.0 * sign) / i;
            			sign *= -1;
			}
		System.out.println("Sum : "+sum);
		}
		else
		{
			System.out.println("Error:: number is not Positive");
		}
			 
       
	}
}