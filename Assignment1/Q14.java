// program to Write a program to print Fibonacci series of n terms where n is input by user :

import java.util.*;
class Q14{

	public static void main(String args[])
	{
		int num,lastNum=0,currNum=1,sum=0;
		
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the Number");
		num=sc.nextInt();
		
		System.out.println("\nFibonacci Series::");
	
		System.out.println(lastNum+"\n"+currNum);
		
		for(int i=2;i<num;i++)
		{
			sum=currNum+lastNum;
			System.out.println(sum);
			lastNum=currNum;
			currNum=sum;
		}
	}
}