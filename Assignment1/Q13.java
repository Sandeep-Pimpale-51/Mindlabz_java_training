// program to to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.


import java.util.*;
class Q13{

	public static void main(String args[])
	{
		int num=0,rem=0,sum=0;
		int i=1;
		
		System.out.println("Armstrong number Between 1-500::");		
		while(i<=500)
		{
			num=i;
			sum=0;
			while(num>0)
			{
				rem=num%10;
				sum=sum+(rem*rem*rem);
				num=num/10;		
			}
			if(sum==i)
			{
				System.out.println(i);
					
			}
			
			i++;	
		}
				
				
		
		

	}
}