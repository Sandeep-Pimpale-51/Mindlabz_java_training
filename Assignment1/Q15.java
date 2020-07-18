// program to Write a programto calculate the sum of following series where n is input by user. 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n 

import java.util.*;
class Q15{

	public static void main(String args[])
	{
		int num;
		float sum=0;
		
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the Number");
		num=sc.nextInt();
		
		 for (int i = 1; i <= num; i++) 
		{
         	 sum = sum +(float)1/i;
		}
		System.out.println("Sum : "+sum);	 
       
	}
}